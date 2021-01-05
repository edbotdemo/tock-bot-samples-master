import ai.tock.bot.api.client.newBot
import ai.tock.bot.api.client.newStory
import ai.tock.bot.api.client.unknownStory
import ai.tock.bot.api.websocket.start
import ai.tock.bot.connector.messenger.buttonsTemplate
import ai.tock.bot.connector.messenger.nlpQuickReply

fun main() {
    start( // Integrate with a local Tock (see last params)
            newBot(
                    "PUT-YOUR-TOCK-APP-API-KEY-HERE", // Get your app API key from Bot Configurations in Tock Studio
                    //réponse simple ,correspondant à l'intention greetings
                    newStory("greetings") {
                        end("Coucou")
                    },
                    //réponse sous format card correspondant à l'intention location
                    newStory("location") {
                        end(
                                newCard(
                                        "Titre",
                                        "Sous-Titre",
                                        newAttachment("https://url-image.png"),
                                        newAction("Action 1"),
                                        newAction("Action 2", "http://redirection")
                                )
                        )
                    },
                    //réponse sous format spécifique au canal (ici messenger)
                    //correspondant à l'intention goodbye
                    newStory("goodbye") {
                        end {
                            buttonsTemplate("Mais pourquoi?", nlpQuickReply("Je ne veux pas partir"))
                        }
                    },
                    //réponse renvoyée quand l'intention n'est pas répertoriée
                    unknownStory {
                        end("je n'ai pas compris")
                    }
            ),
            "http://localhost:8080") // The local platform address
}
