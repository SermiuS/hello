package com.example.hello;

public class Questions {

    public String mQuestions[] = {
            "Kurā gadā piedzima Mocarts?",
            "Mocartam bija fenomenāla mūzika,atmiņa un ...",
            "Kā sauca Mocarta tēvu?",
            "Kas bija Mocarta tēvs?",
            "Cik gadu vecumā, Volfgans sāka spēlet klavesīnu?",
            "Cik gadu vecumā, Volfgans sacerēja pirmās lugas?",
            "Pirmais Volfganga skaņdarbs?",

            "Kurā gadā piedzima Johans Bahs?",
            "Cik mūzikas darbu autors ir Johans Bahs?",
            "Kas bija Johana Baha senči?",
            "Kādus mūzikas instumentus, iemācija spelēt Johana Baha brālis?",
            "Kāda mūzikas stilā, it Baha radošais mantojums?",

            "Kurā gadā piedzima Antonio Vivaldi?",
            "Cik operas ir sarakstijis Antonio Vivaldi?",
            "Par ko ķļuva Antonio Vivaldi 1704. gadā?",
            "Antonio Vivaldi nācija?",

            "Kurā gadā piedzima Ludvigs van Bēthovens?",
            "Visvairāk izpilditājs kompominsts pasaulē?",
            "Kurā gadā notika pirmā Ludviga van Bēthovena izrāde?"
    };

    private String mChoices[][] = {
            {"1756", "1856","1656","1901"},
            {"Ātrums","Improvizācija","Dziedāšana","Plastika"},
            {"Antonio","Saljeri","Amadejs","Leopolds"},
            {"Ģitārists","Vijolnieks","Bruņinieks","Grāfs"},
            {"5","3","7","8"},
            {"5","3","7","6"},
            {"Kāzu maršs","40 simfonija","Andante C-dur","Skaņas veido atmiņas"},

            {"1786","1812","1685","1905"},
            {"Vairāk par 1000","1000","896","500"},
            {"Ārsti","Muzikanti","Mākslinieki un mūziķi","Bruņinieki"},
            {"Ģitāra","Ērģeles un klavieres","Bungas","Vijole"},
            {"Kubisms","Reālisms","Baroko","Modernisms"},

            {"1703","1704","1678","1492"},
            {"Apmēram 40","Apmēram 50","34","24"},
            {"Grāfs","Vijoles meistaru","Garīdznieks","Bruņinieks"},
            {"Vācietis","Itālis","Slāvs","Anglis"},

            {"1770","1790","1600","1750"},
            {"Mocarts","Bahs","Vivaldi","Bēthovens"},
            {"1488","1887","1778","1699"},

    };

    private String mCorrectAnswers[] = {"1756","Improvizācija","Leopolds","Vijolnieks","3","5","Andante C-dur","1685","Vairāk par 1000","Mākslinieki un mūziķi","Ērģeles un klavieres","Baroko","1678","Apmēram 40","Garīdznieks","Itālis","1770","Bēthovens","1778"};




    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a){
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a){
        String choice = mChoices[a][2];
        return choice;
    }

    public String getChoice4(int a){
        String choice = mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }










    public String mQuestions1[] = {
            "В каком году родился Моцарт?",
            "Моцарт обладал феноменальным слухом, памятью, а что еще было у него?",
            "Как звали отца Моцарта?",
            "Кем был отец Моцарта?",
            "Во сколько лет, Моцарт начал играть на клавесине?",
            "Первые пьесы Моцарт начал сочинять в ... лет.",
            "Первым сочинением Моцарта стало",

            "В каком году родился Иоганн Бах?",
            "Автором скольки произведений, является Иоганн Бах?",
            "Кем были предки Иоганна Баха?",
            "На каких инструментах, брат обучал играть Иоганна Баха?",
            "Творческое наследие Баха в стиле ...",

            "В каком году родился Вивальди?",
            "Автор скольки опер, является Вивальди?",
            "Кем стал Вивальди в 1704 году?",
            "Кем по национальности был Вивальди?",

            "В каком году родился Людвиг ван Бетховен?",
            "Наиболее исполняемый композитор в мире?",
            "В каком году состоялось первое выступление Людвига ван Бетовена?",

    };

    private String mChoices1[][] = {
            {"1756", "1856","1656","1901"},
            {"Скорость","Импровизация","Пение","Пластика"},
            {"Антонио","Сальери","Амадей","Леопольд"},
            {"Гитарист","Скрипач","Рыцарь","Граф"},
            {"5","3","7","8"},
            {"5","3","7","6"},
            {"Свадебный марш","Симфония 40","Анданте До мажор","Звуки пораждают мысли"},

            {"1786","1812","1685","1905"},
            {"Более 1000","1000","896","500"},
            {"Лекари","Музыканты","Артисты и музыканты","Рыцари"},
            {"Гитара","Орган и клавир","Барабаны","Скрипка"},
            {"Кубизм","Реализм","Барокко","Модернизм"},

            {"1500","1492","1905","1678"},
            {"20","Около 40","Больше 40","100"},
            {"Священником","Рыцарем","Мастером скрипки","Графом"},
            {"Славянин","Немец","Итальянец","Римлянин"},

            {"1770","1790","1600","1750"},
            {"Моцарт","Бах","Вивальди","Бетховен"},
            {"1488","1887","1778","1699"},

    };

    private String mCorrectAnswers1[] = {"1756","Импровизация","Леопольд","Скрипач","3","5","Анданте До мажор","1685","Более 1000","Артисты и музыканты","Орган и клавир","Барокко","1678","Около 40","Священником","Итальянец","1770","Бетховен","1778"};

    public String getQuestion1(int a){
        String question = mQuestions1[a];
        return question;
    }

    public String getChoice11(int a){
        String choice = mChoices1[a][0];
        return choice;
    }

    public String getChoice21(int a){
        String choice = mChoices1[a][1];
        return choice;
    }

    public String getChoice31(int a){
        String choice = mChoices1[a][2];
        return choice;
    }

    public String getChoice41(int a){
        String choice = mChoices1[a][3];
        return choice;
    }

    public String getCorrectAnswer1(int a){
        String answer = mCorrectAnswers1[a];
        return answer;
    }
}