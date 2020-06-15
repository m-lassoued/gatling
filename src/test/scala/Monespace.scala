
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class Monespace extends Simulation {

	val httpProtocol = http
		.baseUrl("https://ws-openapi.cnfpt.fr")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("fr,ar;q=0.9,en-US;q=0.8,en;q=0.7")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.97 Safari/537.36")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "none",
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_1 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_7 = Map(
		"Origin" -> "https://moncompte.cnfpt.fr",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "font",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_8 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"Origin" -> "https://moncompte.cnfpt.fr",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "same-origin",
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_9 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "same-site",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_10 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Content-Type" -> "application/json",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"authorization" -> "Bearer 67abe61b-706d-3b32-8bd9-8a069ee712c5")

	val headers_11 = Map(
		"Access-Control-Request-Headers" -> "authorization,content-type",
		"Access-Control-Request-Method" -> "GET",
		"Origin" -> "https://monespace.cnfpt.fr",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-site")

	val headers_12 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Content-Type" -> "application/json",
		"Origin" -> "https://monespace.cnfpt.fr",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-site",
		"authorization" -> "Bearer 67abe61b-706d-3b32-8bd9-8a069ee712c5")

	val headers_13 = Map(
		"Access-Control-Request-Headers" -> "authorization,content-type",
		"Access-Control-Request-Method" -> "POST",
		"Origin" -> "https://monespace.cnfpt.fr",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-site")

	val headers_28 = Map(
		"Origin" -> "https://monespace.cnfpt.fr",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "font",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_119 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "iframe",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "cross-site",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_120 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "style",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_121 = Map(
		"accept" -> "text/css,*/*;q=0.1",
		"cache-control" -> "no-cache",
		"pragma" -> "no-cache",
		"sec-fetch-dest" -> "style",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site",
		"x-client-data" -> "CKm1yQEIlrbJAQiltskBCMS2yQEIqZ3KAQiJrMoBCP+8ygEI+77KARibvsoB")

	val headers_123 = Map(
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "script",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_124 = Map(
		"cache-control" -> "no-cache",
		"pragma" -> "no-cache",
		"sec-fetch-dest" -> "script",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site")

	val headers_125 = Map(
		"Origin" -> "https://cnfptembed.libcast.com",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "font",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_126 = Map(
		"accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"cache-control" -> "no-cache",
		"pragma" -> "no-cache",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site")

	val headers_127 = Map(
		"Content-Type" -> "text/plain;charset=UTF-8",
		"Origin" -> "https://cnfptembed.libcast.com",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin")

    val uri1 = "https://www.google-analytics.com/r/collect"
    val uri3 = "https://www.googletagmanager.com/gtag/js"
    val uri4 = "https://monespace.cnfpt.fr"
    val uri5 = "https://moncompte.cnfpt.fr"
    val uri6 = "https://cnfptembed.libcast.com"
    val uri7 = "https://fonts.googleapis.com/icon"

	val scn = scenario("Monespace")
		.exec(http("Monespace_0")
			.get(uri5 + "/authentication/login?client_id=6xnnTHCj6qpzZO9X4AdHGke0mzoa&commonAuthCallerPath=%2Foauth2%2Fauthorize&forceAuth=false&nonce=o7gxMox6yzAAyt0z2nn6mLmOnuyHZLUxl4tUg6HO&passiveAuth=false&redirect_uri=https%3A%2F%2Fmonespace.cnfpt.fr%2Flogin-callback&response_type=id_token+token&scope=openid+profile&state=o7gxMox6yzAAyt0z2nn6mLmOnuyHZLUxl4tUg6HO&tenantDomain=carbon.super&sessionDataKey=b5137348-2c6c-4d8c-a990-2c624179695b&relyingParty=6xnnTHCj6qpzZO9X4AdHGke0mzoa&type=oidc&sp=meca&isSaaSApp=false&authenticators=BasicAuthenticator:LOCAL")
			.headers(headers_0)
			.resources(http("Monespace_1")
			.get(uri5 + "/resources/dist/images/logo-alone.svg")
			.headers(headers_1),
            http("Monespace_2")
			.get(uri5 + "/logo/7")
			.headers(headers_1),
            http("Monespace_3")
			.get(uri5 + "/logo/6")
			.headers(headers_1),
            http("Monespace_4")
			.get(uri5 + "/logo/2")
			.headers(headers_1),
            http("Monespace_5")
			.get(uri5 + "/logo/3")
			.headers(headers_1),
            http("Monespace_6")
			.get(uri5 + "/logo/4")
			.headers(headers_1),
            http("Monespace_7")
			.get(uri5 + "/resources/dist/fonts/mcc/mcc.ttf?7zk82j")
			.headers(headers_7)))
		.pause(9)
		.exec(http("Monespace_8")
			.post(uri5 + "/is/commonauth")
			.headers(headers_8)
			.formParam("_csrf", "3283a066-99d8-4370-b60a-c3cbae5edb3b")
			.formParam("chkRemember", "on")
			.formParam("sessionDataKey", "b5137348-2c6c-4d8c-a990-2c624179695b")
			.formParam("username", "xxx@cnfpt.fr")
			.formParam("password", "xxx")
			.resources(http("Monespace_9")
			.get(uri5 + "/oauth2/authorize?response_type=id_token%20token&client_id=6xnnTHCj6qpzZO9X4AdHGke0mzoa&state=gkHjYHzhQ14HVBLXsDLZ3BfNbAAhd2ezg01jKJ7k&redirect_uri=https%3A%2F%2Fmonespace.cnfpt.fr%2Flogin-callback&scope=openid%20profile&nonce=gkHjYHzhQ14HVBLXsDLZ3BfNbAAhd2ezg01jKJ7k")
			.headers(headers_9),
            http("Monespace_10")
			.get(uri4 + "/assets/i18n/fr.json")
			.headers(headers_10),
            http("Monespace_11")
			.options(uri5 + "/oauth2/userinfo?schema=openid")
			.headers(headers_11),
            http("Monespace_12")
			.get(uri5 + "/oauth2/userinfo?schema=openid")
			.headers(headers_12),
            http("Monespace_13")
			.options("/pds-bo/1.0.0/agent/statut")
			.headers(headers_13),
            http("Monespace_14")
			.post("/pds-bo/1.0.0/agent/statut")
			.headers(headers_12)
			.body(RawFileBody("/Monespace/0014_request.json")),
            http("Monespace_15")
			.get(uri4 + "/assets/i18n/fr.json")
			.headers(headers_10),
            http("Monespace_16")
			.options("/pds-bo/1.0.0/statistiques-log")
			.headers(headers_13),
            http("Monespace_17")
			.post("/pds-bo/1.0.0/statistiques-log")
			.headers(headers_12)
			.body(RawFileBody("/Monespace/0017_request.json")),
            http("Monespace_18")
			.options("/pds-bo/1.0.0/log/creation")
			.headers(headers_13),
            http("Monespace_19")
			.options("/pds-bo/1.0.0/agent/profil/derniere-connexion")
			.headers(headers_13),
            http("Monespace_20")
			.post("/pds-bo/1.0.0/log/creation")
			.headers(headers_12)
			.body(RawFileBody("/Monespace/0020_request.json")),
            http("Monespace_21")
			.post("/pds-bo/1.0.0/agent/profil/derniere-connexion")
			.headers(headers_12)
			.body(RawFileBody("/Monespace/0021_request.json")),
            http("Monespace_22")
			.options("/pds-bo/1.0.0/mes-formations/13")
			.headers(headers_11),
            http("Monespace_23")
			.options("/pds-bo/1.0.0/agent/profil/departement-agent/13")
			.headers(headers_11),
            http("Monespace_24")
			.options("/pds-bo/1.0.0/e-communaute/pierreyves.lemoult@cnfpt.fr")
			.headers(headers_11),
            http("Monespace_25")
			.get("/pds-bo/1.0.0/agent/profil/departement-agent/13")
			.headers(headers_12),
            http("Monespace_26")
			.options("/pds-bo/1.0.0/offre-formations/13")
			.headers(headers_11),
            http("Monespace_27")
			.get("/pds-bo/1.0.0/offre-formations/13")
			.headers(headers_12),
            http("Monespace_28")
			.get(uri4 + "/fontawesome-webfont.af7ae505a9eed503f8b8.woff2?v=4.7.0")
			.headers(headers_28),
            http("Monespace_29")
			.get("/pds-bo/1.0.0/e-communaute/pierreyves.lemoult@cnfpt.fr")
			.headers(headers_12)
			.check(status.is(500)),
            http("Monespace_30")
			.get("/pds-bo/1.0.0/mes-formations/13")
			.headers(headers_12),
            http("Monespace_31")
			.options("/pds-bo/1.0.0/notifications/count/13")
			.headers(headers_11),
            http("Monespace_32")
			.get("/pds-bo/1.0.0/notifications/count/13")
			.headers(headers_12),
            http("Monespace_33")
			.get(uri4 + "/assets/images/svg/picto-career-management-DIS.svg")
			.headers(headers_1),
            http("Monespace_34")
			.get(uri4 + "/assets/images/svg/picto-career-management-PRE.svg")
			.headers(headers_1),
            http("Monespace_35")
			.get(uri4 + "/assets/images/svg/picto-career-management-MIX.svg")
			.headers(headers_1)))
		.pause(14)
		.exec(http("Monespace_36")
			.options("/pds-bo/1.0.0/statistiques-log")
			.headers(headers_13)
			.resources(http("Monespace_37")
			.post("/pds-bo/1.0.0/statistiques-log")
			.headers(headers_12)
			.body(RawFileBody("/Monespace/0037_request.json")),
            http("Monespace_38")
			.options("/pds-bo/1.0.0/agent/profil/departement-agent/13")
			.headers(headers_11),
            http("Monespace_39")
			.options("/pds-bo/1.0.0/offre-formations/log")
			.headers(headers_13),
            http("Monespace_40")
			.get("/pds-bo/1.0.0/agent/profil/departement-agent/13")
			.headers(headers_12),
            http("Monespace_41")
			.post("/pds-bo/1.0.0/offre-formations/log")
			.headers(headers_12)
			.body(RawFileBody("/Monespace/0041_request.json")),
            http("Monespace_42")
			.options("/pds-bo/1.0.0/recherche/detail-prestation")
			.headers(headers_13),
            http("Monespace_43")
			.post("/pds-bo/1.0.0/recherche/detail-prestation")
			.headers(headers_12)
			.body(RawFileBody("/Monespace/0043_request.json")),
            http("Monespace_44")
			.get(uri4 + "/assets/images/svg/docs.svg")
			.headers(headers_1)))
		.pause(2)
		.exec(http("Monespace_45")
			.options("/pds-bo/1.0.0/notifications/count/13")
			.headers(headers_11)
			.resources(http("Monespace_46")
			.options("/pds-bo/1.0.0/agent/profil/departement-agent/13")
			.headers(headers_11),
            http("Monespace_47")
			.options("/pds-bo/1.0.0/e-communaute/pierreyves.lemoult@cnfpt.fr")
			.headers(headers_11),
            http("Monespace_48")
			.get("/pds-bo/1.0.0/agent/profil/departement-agent/13")
			.headers(headers_12),
            http("Monespace_49")
			.get("/pds-bo/1.0.0/notifications/count/13")
			.headers(headers_12),
            http("Monespace_50")
			.get(uri4 + "/assets/images/svg/picto-career-management-DIS.svg")
			.headers(headers_1),
            http("Monespace_51")
			.get(uri4 + "/assets/images/svg/picto-career-management-PRE.svg")
			.headers(headers_1),
            http("Monespace_52")
			.get(uri4 + "/assets/images/svg/picto-career-management-MIX.svg")
			.headers(headers_1),
            http("Monespace_53")
			.options("/pds-bo/1.0.0/offre-formations/13")
			.headers(headers_11),
            http("Monespace_54")
			.get("/pds-bo/1.0.0/offre-formations/13")
			.headers(headers_12),
            http("Monespace_55")
			.get("/pds-bo/1.0.0/e-communaute/pierreyves.lemoult@cnfpt.fr")
			.headers(headers_12)
			.check(status.is(500))))
		.pause(9)
		.exec(http("Monespace_56")
			.options("/pds-bo/1.0.0/statistiques-log")
			.headers(headers_13)
			.resources(http("Monespace_57")
			.post("/pds-bo/1.0.0/statistiques-log")
			.headers(headers_12)
			.body(RawFileBody("/Monespace/0057_request.json"))))
		.pause(19)
		.exec(http("Monespace_58")
			.options("/pds-bo/1.0.0/statistiques-log")
			.headers(headers_13)
			.resources(http("Monespace_59")
			.post("/pds-bo/1.0.0/statistiques-log")
			.headers(headers_12)
			.body(RawFileBody("/Monespace/0059_request.json")),
            http("Monespace_60")
			.options("/pds-bo/1.0.0/referentiel/liste-departement/13")
			.headers(headers_11),
            http("Monespace_61")
			.get("/pds-bo/1.0.0/referentiel/liste-departement/13")
			.headers(headers_12),
            http("Monespace_62")
			.options("/pds-bo/1.0.0/mes-cursus/75/PC")
			.headers(headers_11),
            http("Monespace_63")
			.get("/pds-bo/1.0.0/mes-cursus/75/PC")
			.headers(headers_12)))
		.pause(5)
		.exec(http("Monespace_64")
			.options("/pds-bo/1.0.0/notifications/count/13")
			.headers(headers_11)
			.resources(http("Monespace_65")
			.options("/pds-bo/1.0.0/agent/profil/departement-agent/13")
			.headers(headers_11),
            http("Monespace_66")
			.options("/pds-bo/1.0.0/e-communaute/pierreyves.lemoult@cnfpt.fr")
			.headers(headers_11),
            http("Monespace_67")
			.get("/pds-bo/1.0.0/agent/profil/departement-agent/13")
			.headers(headers_12),
            http("Monespace_68")
			.get("/pds-bo/1.0.0/notifications/count/13")
			.headers(headers_12),
            http("Monespace_69")
			.get(uri4 + "/assets/images/svg/picto-career-management-DIS.svg")
			.headers(headers_1),
            http("Monespace_70")
			.get(uri4 + "/assets/images/svg/picto-career-management-PRE.svg")
			.headers(headers_1),
            http("Monespace_71")
			.get(uri4 + "/assets/images/svg/picto-career-management-MIX.svg")
			.headers(headers_1),
            http("Monespace_72")
			.options("/pds-bo/1.0.0/offre-formations/13")
			.headers(headers_11),
            http("Monespace_73")
			.get("/pds-bo/1.0.0/offre-formations/13")
			.headers(headers_12),
            http("Monespace_74")
			.get("/pds-bo/1.0.0/e-communaute/pierreyves.lemoult@cnfpt.fr")
			.headers(headers_12)
			.check(status.is(500))))
		.pause(11)
		.exec(http("Monespace_75")
			.options("/pds-bo/1.0.0/statistiques-log")
			.headers(headers_13)
			.resources(http("Monespace_76")
			.options("/pds-bo/1.0.0/agent/profil/departement-agent/13")
			.headers(headers_11),
            http("Monespace_77")
			.post("/pds-bo/1.0.0/statistiques-log")
			.headers(headers_12)
			.body(RawFileBody("/Monespace/0077_request.json")),
            http("Monespace_78")
			.options("/pds-bo/1.0.0/offre-formations/log")
			.headers(headers_13),
            http("Monespace_79")
			.post("/pds-bo/1.0.0/offre-formations/log")
			.headers(headers_12)
			.body(RawFileBody("/Monespace/0079_request.json")),
            http("Monespace_80")
			.get("/pds-bo/1.0.0/agent/profil/departement-agent/13")
			.headers(headers_12),
            http("Monespace_81")
			.options("/pds-bo/1.0.0/recherche/detail-prestation")
			.headers(headers_13),
            http("Monespace_82")
			.post("/pds-bo/1.0.0/recherche/detail-prestation")
			.headers(headers_12)
			.body(RawFileBody("/Monespace/0082_request.json")),
            http("Monespace_83")
			.options("/pds-bo/1.0.0/referentiel/liste-departement/13")
			.headers(headers_11),
            http("Monespace_84")
			.get("/pds-bo/1.0.0/referentiel/liste-departement/13")
			.headers(headers_12)))
		.pause(4)
		.exec(http("Monespace_85")
			.options("/pds-bo/1.0.0/notifications/count/13")
			.headers(headers_11)
			.resources(http("Monespace_86")
			.options("/pds-bo/1.0.0/agent/profil/departement-agent/13")
			.headers(headers_11),
            http("Monespace_87")
			.options("/pds-bo/1.0.0/e-communaute/pierreyves.lemoult@cnfpt.fr")
			.headers(headers_11),
            http("Monespace_88")
			.get("/pds-bo/1.0.0/agent/profil/departement-agent/13")
			.headers(headers_12),
            http("Monespace_89")
			.get("/pds-bo/1.0.0/notifications/count/13")
			.headers(headers_12),
            http("Monespace_90")
			.get(uri4 + "/assets/images/svg/picto-career-management-DIS.svg")
			.headers(headers_1),
            http("Monespace_91")
			.get(uri4 + "/assets/images/svg/picto-career-management-PRE.svg")
			.headers(headers_1),
            http("Monespace_92")
			.get(uri4 + "/assets/images/svg/picto-career-management-MIX.svg")
			.headers(headers_1),
            http("Monespace_93")
			.options("/pds-bo/1.0.0/offre-formations/13")
			.headers(headers_11),
            http("Monespace_94")
			.get("/pds-bo/1.0.0/offre-formations/13")
			.headers(headers_12),
            http("Monespace_95")
			.get("/pds-bo/1.0.0/e-communaute/pierreyves.lemoult@cnfpt.fr")
			.headers(headers_12)
			.check(status.is(500))))
		.pause(24)
		.exec(http("Monespace_96")
			.options("/pds-bo/1.0.0/referentiel/liste-departement/13")
			.headers(headers_11)
			.resources(http("Monespace_97")
			.get("/pds-bo/1.0.0/referentiel/liste-departement/13")
			.headers(headers_12)))
		.pause(14)
		.exec(http("Monespace_98")
			.options("/pds-bo/1.0.0/recherche/liste-prestations")
			.headers(headers_13)
			.resources(http("Monespace_99")
			.post("/pds-bo/1.0.0/recherche/liste-prestations")
			.headers(headers_12)
			.body(RawFileBody("/Monespace/0099_request.json"))))
		.pause(7)
		.exec(http("Monespace_100")
			.options("/pds-bo/1.0.0/recherche/liste-prestations")
			.headers(headers_13)
			.resources(http("Monespace_101")
			.post("/pds-bo/1.0.0/recherche/liste-prestations")
			.headers(headers_12)
			.body(RawFileBody("/Monespace/0101_request.json")),
            http("Monespace_102")
			.options("/pds-bo/1.0.0/recherche/liste-prestations")
			.headers(headers_13),
            http("Monespace_103")
			.post("/pds-bo/1.0.0/recherche/liste-prestations")
			.headers(headers_12)
			.body(RawFileBody("/Monespace/0103_request.json")),
            http("Monespace_104")
			.options("/pds-bo/1.0.0/recherche/liste-prestations")
			.headers(headers_13),
            http("Monespace_105")
			.post("/pds-bo/1.0.0/recherche/liste-prestations")
			.headers(headers_12)
			.body(RawFileBody("/Monespace/0105_request.json")),
            http("Monespace_106")
			.options("/pds-bo/1.0.0/recherche/liste-prestations")
			.headers(headers_13),
            http("Monespace_107")
			.post("/pds-bo/1.0.0/recherche/liste-prestations")
			.headers(headers_12)
			.body(RawFileBody("/Monespace/0107_request.json"))))
		.pause(8)
		.exec(http("Monespace_108")
			.options("/pds-bo/1.0.0/notifications/count/13")
			.headers(headers_11)
			.resources(http("Monespace_109")
			.options("/pds-bo/1.0.0/agent/profil/departement-agent/13")
			.headers(headers_11),
            http("Monespace_110")
			.options("/pds-bo/1.0.0/e-communaute/pierreyves.lemoult@cnfpt.fr")
			.headers(headers_11),
            http("Monespace_111")
			.get("/pds-bo/1.0.0/agent/profil/departement-agent/13")
			.headers(headers_12),
            http("Monespace_112")
			.get("/pds-bo/1.0.0/notifications/count/13")
			.headers(headers_12),
            http("Monespace_113")
			.get(uri4 + "/assets/images/svg/picto-career-management-DIS.svg")
			.headers(headers_1),
            http("Monespace_114")
			.get(uri4 + "/assets/images/svg/picto-career-management-PRE.svg")
			.headers(headers_1),
            http("Monespace_115")
			.get(uri4 + "/assets/images/svg/picto-career-management-MIX.svg")
			.headers(headers_1),
            http("Monespace_116")
			.options("/pds-bo/1.0.0/offre-formations/13")
			.headers(headers_11),
            http("Monespace_117")
			.get("/pds-bo/1.0.0/offre-formations/13")
			.headers(headers_12),
            http("Monespace_118")
			.get("/pds-bo/1.0.0/e-communaute/pierreyves.lemoult@cnfpt.fr")
			.headers(headers_12)
			.check(status.is(500))))
		.pause(7)
		.exec(http("Monespace_119")
			.get(uri6 + "/widget/presentation-de-mon-espace-cnfpt")
			.headers(headers_119)
			.resources(http("Monespace_120")
			.get(uri6 + "/player/css/player.css?v=v2.10.9")
			.headers(headers_120),
            http("Monespace_121")
			.get(uri7 + "?family=Material+Icons")
			.headers(headers_121),
            http("Monespace_122")
			.get(uri6 + "/player/css/player.skin-default.css?v=v2.10.9")
			.headers(headers_120),
            http("Monespace_123")
			.get(uri6 + "/player/js/player.js?v=v2.10.9")
			.headers(headers_123),
            http("Monespace_124")
			.get(uri3 + "?id=UA-807574-10")
			.headers(headers_124),
            http("Monespace_125")
			.get(uri6 + "/player/font/player.ttf?gi8zuc")
			.headers(headers_125)))
		.pause(1)
		.exec(http("Monespace_126")
			.get(uri1 + "?v=1&_v=j82&a=1758606069&t=pageview&_s=1&dl=https%3A%2F%2Fcnfptembed.libcast.com%2Fwidget%2Fpresentation-de-mon-espace-cnfpt&dr=https%3A%2F%2Fmonespace.cnfpt.fr%2Fdecouvrir&ul=fr&de=UTF-8&dt=Pr%C3%A9sentation%20de%20Mon%20espace%20CNFPT&sd=24-bit&sr=1536x864&vp=1215x684&je=0&_u=IADAAUAB~&jid=1258522099&gjid=1807410320&cid=331920835.1583400418&tid=UA-807574-10&_gid=1585994571.1592238793&_r=1&gtm=2ou640&z=1636699720")
			.headers(headers_126))
		.pause(10)
		.exec(http("Monespace_127")
			.post(uri6 + "/sfLibcastAnalyticsPlugin/tracker.php?t=1592238803568")
			.headers(headers_127)
			.body(RawFileBody("/Monespace/0127_request.txt")))
		.pause(9)
		.exec(http("Monespace_128")
			.post(uri6 + "/sfLibcastAnalyticsPlugin/tracker.php?t=1592238813568")
			.headers(headers_127)
			.body(RawFileBody("/Monespace/0128_request.txt")))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}