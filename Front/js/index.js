$(document).ready(function () {
    initalizeTableDetail();
});

var url = "http://127.0.0.1:8080/controller/";
let xhr = new XMLHttpRequest();

function deleteTableRow(id) {
    xhr.addEventListener("readystatechange", function () {
        if (xhr.status == 200) {
            alert(`ID ${id} removido`);
        }
    });

    xhr.open("DELETE", url + "delete/" + id);
    xhr.setRequestHeader("content-type", "application/json");
    xhr.send();
}

function updateTableRow(id) {
    xhr.addEventListener("readystatechange", function () {
        if (xhr.status == 200) {
            alert(`ID ${id} removido`);
        }
    });

    xhr.open("PUT", url + "update/" + id);
    xhr.setRequestHeader("content-type", "application/json");
    xhr.send();
}

function initalizeTableDetail() {
    var data;

    xhr.onload = function () {
        if (xhr.status == 200) {
            data = JSON.parse(xhr.responseText);
            data.forEach(element => {
                setTableData(element);
            });
        }
    };

    xhr.open("GET", url + "cds");
    xhr.setRequestHeader("content-type", "application/json");
    xhr.send();
}

function setTableData(data) {
    $('.details').append(`
        <tr>
            <td>${data.id}</td>
            <td>${data.name}</td>
            <td>${data.genre}</td>
            <td>${data.album}</td>
            <td>${data.price}</td>
            <td><button id="deletar" onclick='deleteTableRow(${data.id})' href='#'>Delete</button></td>
            <td><button id ="editar" onclick='updateTableRow(${data.id})' href='#'>Edit</button></td>
        </tr>
    `);
}

function saveData(data) {
    xhr.open("POST", url + "save");
    xhr.setRequestHeader("content-type", "application/json");
    xhr.send(JSON.stringify({
        name: data.target['name'].value,
        genre: data.target['genre'].value,
        album: data.target['album'].value,
        price: data.target['price'].value
    }));

}