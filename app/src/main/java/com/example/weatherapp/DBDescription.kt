package com.example.weatherapp

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBDescription(context: Context): SQLiteOpenHelper(context,"DESCRIPTIONDB",null,1) {

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE DESCRIPTIONS(DESCRIPTIONID INTEGER PRIMARY KEY AUTOINCREMENT,DESCRIPTION TEXT)")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ('Aglaonema zmienna (Aglaonema commutatum) to tropikalna roślina zielna należąca do rodziny obrazkowatych (Araceae). W środowisku naturalnym występuje w ciepłych i wilgotnych obszarach Azji (m.in. Indonezja, Filipiny). Porasta poszycie lasów.\n" +
                "\n" +
                "Aglaonema zmienna w uprawie pokojowej osiąga 60-80 cm wysokości (w naturze nawet do 2 m!). Wytwarza duże, wydłużone, sztywne liście. Ich charakterystyczną cechą jest to, że są bardzo wzorzyste i w zależności od odmiany mogą mieć jasne, punktowe prążki, tworzące różne wzory, a czasem zlewające się duże plamy pokrywając większą część blaszki liściowej (w ostatnim przypadku mogą przypominać difenbachię).\n" +
                "\n" +
                "Roślina tworzy kolbiaste kwiatostany, ale w uprawie pokojowej w Polsce bardzo rzadko zakwita.\n" +
                "\n" +
                "Aglaonema to silnie trujący gatunek (po angielsku jest nazywana \"poison dart plant\", co w wolnym tłumaczeniu oznacza \"trująca roślina-strzałka\").')")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ('Ardizja karbowana (Ardisia crenata) należy do rodziny (Myrsinaceae). Roślina w środowisku naturalnym występuje w Japonii oraz Ameryce Południowej, a w Polsce jest cenną rośliną zdobiącą domy w okresie Świąt Bożego Narodzenia.\n" +
                "\n" +
                "Roślina ma wzniesiony pokrój i dorasta do 100 cm wysokości. Wytwarza błyszczące, ciemnozielone liście, na których mogą pojawiać się gruzełkowate zgrubienia. Nie należy ich niszczyć – to naturalne zjawisko dla ardizji. W zgrubieniach znajdują się bakterie, które żyją w symbiozie z rośliną asymilując azot z powietrza.\n" +
                "\n" +
                "Ardizja karbowana kwitnie od czerwca do września tworząc małe, gwiazdowate kwiaty barwy białej lub różowej.\n" +
                "\n" +
                "Najbardziej dekoracyjna jest jednak po kwitnieniu, gdyż zawiąże okrągłe, czerwone owoce są pestkowcami, które mogą utrzymywać się na roślinie nawet do przyszłorocznego kwitnienia!')")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ('Szafirek armeński (Muscari armeniacum) to niewielka roślina cebulowa z rodziny szparagowatych (Asparagaceae). Występuje w rejonie Morza Śródziemnego aż po Azję Mniejszą.\n" +
                "\n" +
                "Roślina dorasta dorasta do 10-15 (pęd kwiatostanowy). Odziomkowe liście szafirka armeńskiego pojawiają się w ilości 6-8 już jesienią i mogą osiągać do 25 cm. Są koloru zielonego i zgięte w rynienkę. Jedna roślina (cebula) wytwarza do kilku pędów kwiatostanowych.\n" +
                "\n" +
                "Szafirek armeński kwitnie od końca kwietnia do początku czerwca. Kwiaty w kształcie kulki, są w gęstych gronach o długości ok. 8 cm. Szafirki są znane ze swojego intensywnego, kobaltowo-niebieskiego koloru (stąd nazwa), ale występują również w odmianach fioletowo niebieskich, jasnoniebieskich i białych.\n" +
                "\n" +
                "Cebula szafirka armeńskiego ma wydłużony kształt i obwód do 10 cm. Posiada jasnoszarą łuskę.')")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ('Hiacynt (Hyacinthus) to bylina cebulowa należąca do rodziny szparagowatych (Asparagaceae). Do rodzaju należy 30 gatunków roślin, które pochodzą ze wschodnich rejonów Morza Śródziemnego aż po południowo-zachodnią Azję. Obecnie w uprawie spotykamy jednak tylko odmiany hiacynta wschodniego (H. orientalis).\n" +
                "\n" +
                "Roślina wytwarzają mięsiste, błyszczące, równowąskie, krótkie liście, które osiągają do 30 cm wysokości. Gruby pęd kwiatostanowy dorasta do ok. 20 cm.\n" +
                "\n" +
                "Hiacynt kwitnie w kwietniu i maju. Kwiaty zebrane w efektowne kwiatostany (grona) utrzymują się przez ok. 2 tygodnie. Są średniej wielkości, dzwonkowate lub lejkowate i mają 6 lub więcej płatków (są pojedyncze lub pełne). Występują w bardzo wielu kolorach (białym, żółtym, pomarańczowym, łososiowym, różowym, czerwonym, fioletowym, niebieskim). Są znane i cenione za swój piękny, intensywny, słodki zapach.\n" +
                "\n" +
                "Cebula hiacynta jest duża, kulista i może mieć wiele kolorów (łuski okrywające mogą być białe, brązowawe, czerwone czy też fioletowe).')")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ('Tulipan (Tulipa) to najbardziej znana roślina cebulowa. Należy do rodziny liliowatych (Liliaceae) i zalicza się do niego ok. 120 gatunków i kilkanaście tysięcy odmian! Naturalnie występuje w Europie południowej, Afryce północnej i Azji.\n" +
                "\n" +
                "Łodyga tulipanów jest sztywna i prosta, gładka lub owłosiona zależnie od gatunku. U niektórych tulipanów może się rozgałęziać i tym samym tworzyć kilka kwiatów.\n" +
                "\n" +
                "Liście są bezogonkowe, szerokie, najczęściej szarozielone i wyrastają wprost z cebuli (u niektórych gatunków mogą być też ułożone naprzemianlegle na łodydze). Są pokryte woskowym nalotem. Ich kształt jest najczęściej eliptyczny lub równowąski, zaostrzony na końcu. Niekiedy pomiędzy unerwieniem liści występują ciemnopurpurowe smugi lub rysunek w postaci nieregularnych prostokątów.\n" +
                "\n" +
                "Kwiaty tulipanów są pojedyncze lub pełne i występują w bardzo wielu kolorach i kształtach (kubkowatym, kielichowatym, itd.). Okwiat składa się z trzech wewnętrznych i trzech zewnętrznych płatków. Mogą mieć od kliku do kilkunastu centymetrów długości. Charakterystyczne jest, że kwiaty u podstawy mają zwykle inaczej zabarwioną plamę.\n" +
                "\n" +
                "Część podziemna tulipana to jednoroczna, jajowata cebula, która potrafi osiągać ok. 16 cm średnicy.\n" +
                "\n" +
                "Hodowcy ustalili podział tulipanów na 15 grup różniących się od siebie kwiatami i czasem kwitnienia.')")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ('Kosaciec żółty (Iris pseudacorus syn. pseudoacorus) to roślina należąca do bylin cebulowych z rodziny kosaćcowatych (Iridaceae). Rośnie dziko w Europie, zachodniej Azji i północno-zachodniej Afryce. W Polsce spotkać go można przede wszystkim na terenach wilgotnych, np. podmokłych łąkach i przy brzegach cieków wodnych.\n" +
                "\n" +
                "Roślina dorasta do 70-100 cm wysokości. Posiada wyprostowaną, w przekroju spłaszczoną, często rozgałęzioną łodygę. Liście są intensywnie zielone, mieczowate (czasem trawiaste), mają 3 cm szerokości, 1 m długości i obejmują pochwami pęd.\n" +
                "\n" +
                "Irys żółty kwitnie od maja do lipca, a jego pojedynczy kwiat utrzymuje się ok. 2 tygodnie. Jest intensywnie żółty, średniej wielkości, posiada długa szypułkę. Kwiaty wyrastają po 1-5 z jednego miejsca. Okwiat jest złożony z 6 zrośniętych płatków – tzw. działek (3 działki zewnętrze i 3 wewnętrze.). Na dolnych, dość szerokich płatkach znajdują się ciemniejsze plamki, otoczone brązowymi kreskami. Kwiaty przekształcają się w trzykomorowe torebki.\n" +
                "\n" +
                "Kosaciec żółty należy do kosaćców bezbródkowych (nie mają szczoteczki włosków na działkach zewnętrznych okwiatu).\n" +
                "\n" +
                "Organem podziemnym irysa żółtego jest kłącze. Cała roślina jest trująca.')")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ('Galtonia biaława, biała (Galtonia) nazywana też błyszczącą lub bardzo często hiacyntem letnim, to cebulowa bylina z rodziny szparagowatych (Asparagaceae). Pochodzi z Afryki, ale jest też uprawiana w innych rejonach świata jako roślina ozdobna.\n" +
                "\n" +
                "Galtonia w czasie kwitnienia może dorastać do ponad 1-1,2 m. wys. Wiosną rozwija długie, wąskolancetowate, mieczowate, zielone liście, zabrane w duże, rozłożyste kępy.\n" +
                "\n" +
                "Galtonia biaława kwitnie latem (VII-IX). Spomiędzy liści wyrasta wzniesiony, sztywny, nagi, gruby, bezlistny, okrągły w przekroju pęd kwiatostanowy, zwieńczony luźnym kwiatostanem złożonym z kilkudziesięciu niedużych kwiatów, mających kształt wydłużonych, białych, zwisających dzwoneczków, osadzonych na krótkich, zielonych szypułkach. Kwiaty w pąkach są zielonkawe i w kwiatostanie rozwijają się stopniowo od dołu do góry, dzięki czemu kwitnienie może trwać nawet miesiąc.')")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ('Cebulica syberyjska (Scilla siberica) to roślina cebulowa z rodziny szparagowatych (Asparagaceae). Roślina w naturze występuje w zachodniej Azji, Kaukazu i wschodniej Europy.\n" +
                "\n" +
                "Cebulica syberyjska osiąga wysokość 10-15 cm. Odziomkowe liście rośliny pojawiają się wczesną wiosną (czasem już w marcu). Są bardzo wąskie, podłużne i zaostrzone na końcu. Utrzymują się do czerwca, a potem zamierają (tzw. znikają).\n" +
                "\n" +
                "Cebulica kwitnie w marcu i kwietniu. Dzwonkowate, zwisające kwiaty o intensywnie niebieskim kolorze wyrastają w gronach, po kilka (2-5) na szczycie dość cienkiego pędu, który ma tendencję do przewieszania się. Kwiaty cebulicy są chętnie odwiedzane przez owady pszczołowate – są jednymi z pierwszych roślin miododajnych w sezonie.\n" +
                "\n" +
                "Cebule roślin są dość małe i z reguły pokryte purpurowymi łuskami (wyjątkiem jest odmiana Alba, której cebulki są jasne).')")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ('Szafirek groniasty (Muscari neglectum syn. Muscari racemosum) to znana roślina cebulowa z rodziny szparagowatych (Asparagaceae). Występuje głównie na obszarze śródziemnomorskim i w Azji Mniejszej, w Polsce kwitnie na polach i trawiastych zboczach. Obok szafirka armeńskiego jest najczęściej uprawianym gatunkiem tej rośliny.\n" +
                "\n" +
                "Jest to bylina, której łodyga dorasta do 20-30 cm. Liście są odziomkowe, wąskie, równowąskie, pojawiają się wczesną wiosną i osiągają do 40 cm długości. Dojrzałe przewieszają się w ok. połowie długości.\n" +
                "\n" +
                "Szafirek groniasty kwitnie na przełomie kwietnia i maja. Na jej szczycie łodygi wytwarza groniasty, stożkowy i mocno zbity kwiatostan. Kwiaty są elipsoidalne, mają zrośnięte płatki długości 4-6 mm i mogą być w kolorach: niebieskim, fioletowym, błękitnym. Rozwijają się od dołu do góry. Owocami szafirków są charakterystyczne, sercowate torebki (5-10 mm).\n" +
                "\n" +
                "Roślina wytwarza niewielką, niejadalną (lekko trującą), podziemną cebulę, mającą ok. 6 cm w obwodzie.')")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ('Frezja (Freesia) to rodzaj bulwiastych bylin z rodziny kosaćcowatych (Iridaceae). W naturze można je spotkać w południowej Afryce, ale są też uprawiane w wielu innych krajach świata.\n" +
                "\n" +
                "Frezja w postaci czystego gatunku rzadko pojawia się w ogrodach, gdyż znacznie uprawowe mają głównie jej atrakcyjne mieszańce ozdobne, pochodzące od dziko rosnących gatunków frezji i określane jako frezje ogrodowe.\n" +
                "\n" +
                "Liście rośliny wyrastają z ziemi wiosną. Są płaskie, zielne i mieczowate, a w górnej części przewieszają się na boki.\n" +
                "\n" +
                "Frezja kwitnie w lipcu (czasem zaczyna w czerwcu). Spomiędzy liści wyrasta wniesiony, sztywny, owalny, gładki, czasem rozgałęziony pęd (ok. 40-60 cm. wys.), zwieńczony charakterystycznie wygiętym w jedną stronę, kłosowatym kwiatostanem, złożonym z kilku dużych, barwnych, kielichowatych kwiatów. Kwiaty w kwiatostanie rozwijają się stopniowo, od dołu do góry i mogą mieć przyjemny zapach.\n" +
                "\n" +
                "Frezja tworzy niedużą, wydłużoną bulwę, pokrytą jasnobrązową, suchą, włóknistą skórką.')")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ('Begonia bulwiasta (Begonia x tuberhybrida) to gatunek tak zwanej byliny cebulowej należącej do rodziny begoniowatych (Begoniaceae). Rośliny te powstały w wyniku krzyżowania wielu gatunków begonii pochodzących z Ameryki Południowej i Andów. W Polsce są roślinami sadzonymi sezonowo w ogrodach i uprawianymi w pojemnikach na balkonach i tarasach.\n" +
                "\n" +
                "Ze względu na cechy morfologiczne begonie bulwiaste dzielimy na:\n" +
                "\n" +
                "begonię bulwiastą wielkokwiatową (Begonia x tuberhybrida grandiflora),\n" +
                "begonię bulwiastą drobnokwiatową (Begonia x tuberhybrida multiflora) i\n" +
                "begonię bulwiastą o zwisłych pędach (Begonia x tuberhybrida pendula flore pleno).\n" +
                "\n" +
                "Begonia bulwiasta charakteryzuje się niesymetrycznym pokrojem i osiąga ok. 20-30 cm wysokości. Łodygi rośliny są wzniesione (tylko u niektórych odmian zwisające), mięsiste i silnie uwodnione. Liście mają kształt sercowato-lancetowaty, u nasady nierówny oraz są mocno piłkowane. Posiadają krótki ogonek liściowy. Blaszka jest gruba, zwykle ciemno zielona i błyszcząca.\n" +
                "\n" +
                "Organami podziemnymi begonii bulwiastej są oczywiście bulwy. Mają one charakterystyczny, spłaszczony, nerkowaty kształt i ciemno-brązowy kolor.\n" +
                "\n" +
                "Begonia kwitnie przez cały sezon – w odpowiednich warunkach jej kwiaty pojawiają się na koniec wiosny i utrzymują do późnej jesieni. Kwiaty pojawiają się w całej, górnej części pędu, wyrastając z kątów liści. Są duże, występują w szerokiej gamie kolorów i różnym układzie płatków (pojedyncze, półpełne, pełne).')")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ('Kamasja (Camassia) to rodzaj bulwiastych bylin z rodziny szparagowatych (Asparagaceae), do których zalicza się ok. 6 gatunków pochodzących z Ameryki Północnej.\n" +
                "\n" +
                "Rośliny te mogą osiągać wysokość od ok. 40-80 cm do 1,2-1,4 m. Rośliny tworzą kuliste bulwy, z których w sezonie rozwijają się wąskie, mieczowate, długie, zielone, odziomkowe, rynienkowate liście, zebrane w kępki.\n" +
                "\n" +
                "Kamasje kwitną w maju i czerwcu, wytwarzając wzniesione, sztywne, nagie pędy, zwieńczone okazałym, groniastym kwiatostanem, złożonym z licznych, niedużych, gwiazdkowych kwiatów, ozdobionych kilkoma długimi pręcikami z żółtymi pylnikami. Kwiaty mogą być białe lub niebieskie. W kwiatostanie rozwijają się stopniowo od dołu do góry. Kwitnienie kamasji trwa ok. 3-4 tyg., po czym roślina zasusza liście i przechodzi w stan letniego spoczynku.')")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ('Zawilec wieńcowy (Anemone coronaria) nazywany też zawilcem koronowym to gatunek kłączowej byliny z rodziny jaskrowatych (Ranunculaceae). Jego naturalne siedliska znajdują się w rejonach śródziemnomorskich oraz w Azji (min. Turcjii, Syrii), ale ze względu na atrakcyjne kwiaty, roślina jest też uprawiana w wielu innych krajach świata.\n" +
                "\n" +
                "Roślina dorasta do ok. 20-30 cm wys. i tworzy tuż nad ziemią niewielką rozetę odziomkowych, krótkołodygowych, zielonych, pierzastych liści, przypominających liście pietruszki naciowej.\n" +
                "\n" +
                "Zawilec wieńcowy kwitnie wiosną (IV-V). Spomiędzy liści wyrastają wzniesione, nagie, sztywne łodyżki kwiatowe z rozwijającą się w połowie ich wysokości kryzą zielonych, pierzastych liści i zwieńczone pojedynczym, dużym kwiatem o miseczkowatej lub talerzykowatej koronie. Każdy kwiat posiada ciemny, wypukły środek z odstającymi pręcikami i grubymi, ciemnymi pylnikami (wyglądem przypominają koronkę otaczającą wypukłą główkę), otoczony okółkiem dużych, delikatnych, barwnych płatków. U gatunku kwiaty są pojedyncze i najczęściej czerwone, ale u odmian mogą być też białe, różowe, niebieskie, fioletowe, a nawet półpełne i pełne.\n" +
                "\n" +
                "Częścią podziemną rośliny jest krótkie, bulwiaste kłącze.')")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ('Fitonia (Fittonia verschaffeltii) należy do rodziny akantowatych (Acanthaceae). W stanie naturalnym jest pnączem i rośnie w tropikalnych lasach deszczowych.\n" +
                "\n" +
                "Roślina ma płożący pokrój i wytwarza dość kruche pędy dorastające do 15 cm. Cała jest lekko owłosiona.\n" +
                "\n" +
                "Swoją dekoracyjność zawdzięcza kolorom liści. Wyrastają na łodydze parami i posiadają krótkie, grube ogonki. Liście fitonii mają najczęściej jajowaty kształt i ciemnozieloną blaszkę liściową o gęstym, jasnym unerwieniu. Nerwy, a czasem też plamy, zależnie od odmiany mogą być koloru białego, różowego, czerwonego, żółtego, pomarańczowego lub jasno zielonego.')")
    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {

    }
}