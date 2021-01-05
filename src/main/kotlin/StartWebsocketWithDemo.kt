import ai.tock.analytics.chatbase.enableChatbase
import ai.tock.bot.api.client.newBot
import ai.tock.bot.api.client.newStory
import ai.tock.bot.api.websocket.startWithDemo
import ai.tock.bot.api.client.unknownStory
import ai.tock.bot.connector.web.webButton
import ai.tock.bot.connector.web.webMessage
import ai.tock.bot.definition.Intent
import ai.tock.bot.engine.BotRepository
import ai.tock.shared.property


fun main() {



    startWithDemo( // Integrate with the Tock demo platform by default
            newBot(
                    "855e23bd-3d50-4e2c-b039-9fde2c688b43", // Get your app API key from Bot Configurations in Tock Studio
                    newStory("outils_office_carousel") {
                        end(
                                newCarousel(
                                        listOf(

                                                newCard(
                                                        "TEAMS",
                                                        "L’outil collaboratif qui vous permet de créer des réunions, de contacter vos équipes et de travailler ensemble",
                                                        newAttachment("https://res.cloudinary.com/dajsnf7wl/image/upload/v1605527492/icons8-microsoft-teams-1024_t4wypk.png"),

                                                        newAction("lien", "https://sncf.sharepoint.com/sites/PortailMesServicesDigitaux/SitePages/Teams-usages.aspx")
                                                ),
                                                newCard(
                                                "OFFICE 365",
                                                "La suite bureautique qui rassemble tous les outils Microsoft",
                                                newAttachment("https://res.cloudinary.com/dajsnf7wl/image/upload/v1605527492/icons8-office-365-550_kqqavz.png"),
                                                newAction("lien", "https://sncf.sharepoint.com/sites/PortailMesServicesDigitaux/SitePages/Vos-usages.aspx")
                                        ),


                                                newCard(
                                                        "SHAREPOINT",
                                                        "L’espace collaboratif pour stocker vos documents d’équipe dans un seul espace ",
                                                        newAttachment("https://res.cloudinary.com/dajsnf7wl/image/upload/v1605527492/icons8-microsoft-sharepoint-2019-550_bey6d5.png"),

                                                        newAction("lien", "https://sncf.sharepoint.com/sites/PortailMesServicesDigitaux/SitePages/SharePoint-tutoriels.aspx?web=1#acc%C3%A9der-a-sharepoint")
                                                ),

                                                newCard(
                                                        "OUTLOOK",
                                                        "Votre messagerie, disponible en version bureau et en ligne ",
                                                        newAttachment("https://res.cloudinary.com/dajsnf7wl/image/upload/v1605000502/Outlook_Logo_pnk7v9.jpg"),

                                                        newAction("lien", "https://sncf.sharepoint.com/sites/PortailMesServicesDigitaux/SitePages/Outlook.aspx")
                                                ),
                                                newCard(
                                                        "POWER BI",
                                                        "L’outil pour créer des tableaux de bords interactifs à partir de vos données Excel ",
                                                        newAttachment("https://res.cloudinary.com/dajsnf7wl/image/upload/v1605527492/icons8-power-bi-550_oau3mi.png"),

                                                        newAction("lien", "https://sncf.sharepoint.com/sites/PortailMesServicesDigitaux/SitePages/PowerBI-usages.aspx")
                                                ),
                                                newCard(
                                                        "ONE DRIVE",
                                                        "L’application pour stocker et sécuriser tous vos documents ",
                                                        newAttachment("https://res.cloudinary.com/dajsnf7wl/image/upload/v1605527492/icons8-microsoft-onedrive-2019-550_ofdkdb.png"),

                                                        newAction("lien", "https://sncf.sharepoint.com/sites/PortailMesServicesDigitaux/SitePages/OneDrive-usages.aspx#d%C3%A9couvrez-onedrive-en-2-minutes-!")
                                                ),
                                                newCard(
                                                        "Planner",
                                                        "L’outil pour organiser et consulter les tâches de toute l’équipe",
                                                        newAttachment("https://res.cloudinary.com/dajsnf7wl/image/upload/v1605527491/icons8-microsoft-planner-2019-550_fi0jat.png"),

                                                        newAction("lien", "https://sncf.sharepoint.com/sites/PortailMesServicesDigitaux/SitePages/Planner.aspx")
                                                ),
                                                newCard(
                                                        "TO DO",
                                                        "L’outil pour organiser toutes vos tâches individuelles",
                                                        newAttachment("https://res.cloudinary.com/dajsnf7wl/image/upload/v1605527492/icons8-microsoft-to-do-app-550_jfclss.png"),

                                                        newAction("lien", "https://sncf.sharepoint.com/sites/PortailMesServicesDigitaux/SitePages/To-Do-tutoriels.aspx")
                                                ),
                                                newCard(
                                                        "PowerAPPS",
                                                        "L’outil pour automatiser la saisie et le traitement de vos données terrain",
                                                        newAttachment("https://res.cloudinary.com/dajsnf7wl/image/upload/v1605527884/PowerApps_Logo_odksnj.png"),

                                                        newAction("lien", "https://sncf.sharepoint.com/sites/PortailMesServicesDigitaux/SitePages/PowerApps.aspx")
                                                ),
                                                newCard(
                                                        "YAMMER",
                                                        "Le réseau social interne qui vous permet de créer et rejoindre des communautés au sein de la SNCF",
                                                        newAttachment("https://res.cloudinary.com/dajsnf7wl/image/upload/v1605527491/icons8-microsoft-yammer-2019-550_ruub6d.png"),

                                                        newAction("lien", "https://sncf.sharepoint.com/sites/PortailMesServicesDigitaux/SitePages/Yammer-usages.aspx")
                                                )



                                        )
                                )
                        )
                    },
                    newStory("service_digitaux_caroussel") {
                        end(
                                newCarousel(
                                        listOf(
                                                newCard(
                                                        "Communiquer à distance", null,
                                                        newAttachment("https://res.cloudinary.com/dajsnf7wl/image/upload/v1605528539/communiquer-%C3%A0-distance_jhqjop.png"),

                                                        newAction("En savoir plus","https://sncf.sharepoint.com/sites/PortailMesServicesDigitaux/SitePages/Communiquer.aspx")
                                                ),
                                                newCard(
                                                        "Travailler en mobilité",
                                                        null,
                                                        newAttachment("https://res.cloudinary.com/dajsnf7wl/image/upload/v1605528539/travailler-en-mobilit%C3%A9_aohyoq.png"),

                                                        newAction("En savoir plus", "https://sncf.sharepoint.com/sites/PortailMesServicesDigitaux/SitePages/Usages%20-%20Travailler%20en%20mobilit%C3%A9%20.aspx")
                                                ),
                                                newCard(
                                                        "Organiser l'activité de mon équipe",
                                                        null,
                                                        newAttachment("https://res.cloudinary.com/dajsnf7wl/image/upload/v1605528538/organiser-le-travail-d_%C3%A9quipe_fn2zh9.png"),

                                                        newAction("En savoir plus", "https://sncf.sharepoint.com/sites/PortailMesServicesDigitaux/SitePages/Organiser.aspx")
                                                ),
                                                newCard(
                                                        "Sécuriser mes données",
                                                        null,
                                                        newAttachment("https://res.cloudinary.com/dajsnf7wl/image/upload/v1605528539/s%C3%A9curiser-ses-donn%C3%A9es_v5gfzp.png"),

                                                        newAction("En savoir plus", "https://sncf.sharepoint.com/sites/PortailMesServicesDigitaux/SitePages/Usages%20-%20Prot%C3%A9gez%20vos%20donn%C3%A9es.aspx")
                                                ),
                                                newCard(
                                                        "Diffuser de l'information",
                                                        null,
                                                        newAttachment("https://res.cloudinary.com/dajsnf7wl/image/upload/v1605528540/diffuser-de-l_information_isltnm.png"),

                                                        newAction("En savoir plus", "https://sncf.sharepoint.com/sites/PortailMesServicesDigitaux/SitePages/Diffuser.aspx")
                                                ),
                                                 newCard(
                                                        "Créer du contenu (documents,présentation etc)",
                                                        null,
                                                        newAttachment("https://res.cloudinary.com/dajsnf7wl/image/upload/v1605528539/cr%C3%A9er-du-contenu_e2cdun.png"),

                                                        newAction("En savoir plus", "https://sncf.sharepoint.com/sites/PortailMesServicesDigitaux/SitePages/Creer.aspx")
                                                ),
                                                newCard(
                                                        "Rechercher & collecter l'informations",
                                                        null,
                                                        newAttachment("https://res.cloudinary.com/dajsnf7wl/image/upload/v1605528540/rechercher-et-collecter-de-l_information_r8xyzs.png"),

                                                        newAction("En savoir plus", "https://sncf.sharepoint.com/sites/PortailMesServicesDigitaux/SitePages/Rechercher%26collecter.aspx")
                                                ),
                                                newCard(
                                                        "Stocker et partager du contenu (documents, vidéos, notes etc)",
                                                        null,
                                                        newAttachment("https://res.cloudinary.com/dajsnf7wl/image/upload/v1605528539/stocker-et-partager-du-contenu_gmxrg1.png"),

                                                        newAction("En savoir plus", "https://sncf.sharepoint.com/sites/PortailMesServicesDigitaux/SitePages/Stocker%26partager.aspx")
                                                ),
                                                newCard(
                                                        "Digitaliser des processus métiers",
                                                        null,
                                                        newAttachment("https://res.cloudinary.com/dajsnf7wl/image/upload/v1605530583/digitaliser-un-processus-me%CC%81tier_refwen.png"),

                                                        newAction("En savoir plus", "https://res.cloudinary.com/dajsnf7wl/image/upload/v1605530774/digitaliser-un-processus-m%C3%A9tier_va6rfw.png")
                                                ),
                                                newCard(
                                                        "Gérer mon identité digitale",
                                                        null,
                                                        newAttachment("https://res.cloudinary.com/dajsnf7wl/image/upload/v1605530775/K921_nc_standard_erpswj.png"),

                                                        newAction("En savoir plus", "https://sncf.sharepoint.com/sites/PortailMesServicesDigitaux/SitePages/Page-Mon-ID.aspx?originalPath=aHR0cHM6Ly9zbmNmLnNoYXJlcG9pbnQuY29tLzp1Oi9zL1BvcnRhaWxNZXNTZXJ2aWNlc0RpZ2l0YXV4L0VWVUVHaE5mak14S3RwazY4Tm5RajBBQl9XWUR5M0QxaWFWR0c4dG5FMWtzNFE_cnRpbWU9blFiUVRTMksyRWc")
                                                )
                                        )
                                )
                        )
                    },unknownStory {
                        end("Pardon je n'ai pas compris, pouvez-vous reformuler votre question.")
                    }
            )

    )
}
