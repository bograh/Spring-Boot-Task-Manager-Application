const taskList = document.getElementById("taskList");
const taskNameInput = document.getElementById("taskName");
const taskDescriptionInput = document.getElementById("taskDescription");
const addTaskButton = document.getElementById("addTask");

const apiUrl = "/tasks"; // URL of your API

addTaskButton.addEventListener("click", () => {
    const taskName = taskNameInput.value;
    const taskDescription = taskDescriptionInput.value;

    if (taskName && taskDescription) {
        const newTask = {
            name: taskName,
            description: taskDescription
        };

        fetch(apiUrl, {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(newTask)
        })
            .then(response => response.json())
            .then(data => {
                taskNameInput.value = "";
                taskDescriptionInput.value = "";
                fetchTasks();
            });
    }
});

function fetchTasks() {
    fetch(apiUrl)
        .then(response => response.json())
        .then(tasks => {
            taskList.innerHTML = "";
            tasks.forEach(task => {
                const listItem = document.createElement("li");
                listItem.textContent = `${task.id}. ${task.name} - ${task.description}`;
                taskList.appendChild(listItem);
            });
        });
}

fetchTasks();