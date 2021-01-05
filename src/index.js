const { Bot } = require('tock-node');
const imageCard = require('tock-node').imageCard;
const action = require('tock-node').action;

const bot = new Bot('855e23bd-3d50-4e2c-b039-9fde2c688b43');

bot.addStory('appel_assistance', bot => {
    bot.send('Assistance SNCF');
});

var s = document.createElement("script"); s.setAttribute("class", "snapcall"); s.setAttribute("id_where", "chats"); s.setAttribute("data-uid", "2778"); s.src = "https://snap.snapcall.io/snapapp.min.js"; document.body.appendChild(s);



var form = document.getElementsByClassName("css-1vjcjrx")[0];
form.addEventListener("submit", function (e) {
    setTimeout(function () {
        console.log(form)
        var h3Tags = document.getElementsByTagName("h3");
        var searchText = "Assistance SNCF";
        var found;
        for (var i = 0; i < h3Tags.length; i++) {
            if (h3Tags[i].textContent == searchText) {
                found = h3Tags[i];
                break;
            }
        }
        if (document.getElementById('chats').contains(found)) {

            document.getElementById('Snapcall_Cadre').style.display = 'block';

        }
    }, 1450);
});
