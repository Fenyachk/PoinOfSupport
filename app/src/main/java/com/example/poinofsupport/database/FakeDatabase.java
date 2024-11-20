package com.example.poinofsupport.database;

import android.os.Build;

import com.example.poinofsupport.model.News;
import com.example.poinofsupport.model.Users;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FakeDatabase implements DatabaseConnection {
    private final List<News> databaseNews = new ArrayList<>();
    private final List<Users> databaseUsers = new ArrayList<>();
    private boolean isConnected = false;

    public FakeDatabase() {

        this.databaseNews.add(new News(1, "22.11.2024 11:14", "Ирина Смирнова",
                "Волонтеры помогают детям с особыми потребностями в образовательных учреждениях",
                "Волонтеры по всей стране начинают работать с детьми, имеющими особые образовательные потребности. Такие дети часто сталкиваются с трудностями в освоении школьной программы, общении со сверстниками и адаптации к образовательной среде. Волонтеры помогают им не только с учебой, но и с участием в школьных мероприятиях, развивают социальные навыки и уверенность в себе. Важной частью работы является индивидуальный подход к каждому ребенку, что позволяет создать комфортные условия для его развития. Программа активно поддерживается государством и включает тренинги для новых волонтеров, а также регулярное взаимодействие с педагогами.Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus sagittis leo a nisl feugiat ultrices. Aenean congue eleifend ante nec porta. Nullam tincidunt eu odio sed pretium. Donec vel sem vel dolor sodales tempus. Maecenas scelerisque tincidunt felis, ac malesuada mauris sollicitudin at. Interdum et malesuada fames ac ante ipsum primis in faucibus. Vestibulum ac egestas ligula. Integer fringilla, magna ac posuere dignissim, mi orci rutrum justo, a feugiat dolor velit at nisl. Nunc consequat lacus sit amet lectus convallis maximus. Nam suscipit non velit in venenatis. Etiam maximus ipsum sit amet rhoncus eleifend. Fusce ut mi eget quam suscipit porttitor at ut nunc. Suspendisse nibh nibh, elementum vel nisl ac, volutpat sagittis sapien. Nulla eget vehicula arcu. Morbi egestas tristique venenatis."));
        this.databaseNews.add(new News(2, "22.11.2024 09:00", "Дмитрий Кузнецов",
                "Программа волонтерства помогает детям из малообеспеченных семей",
                "Множество общественных и благотворительных организаций объявляют набор волонтеров для работы с детьми из малообеспеченных семей. Цель программы — создать равные возможности для детей, оказавшихся в сложных жизненных обстоятельствах. Волонтеры помогают с приобретением учебных материалов, организацией внеклассных занятий, такими как творческие кружки, спортивные секции и экскурсии. Помимо этого, детям оказывается психологическая поддержка, чтобы помочь им преодолевать трудности в общении и ощущать себя частью общества. Программа также помогает семьям, предоставляя консультации по вопросам воспитания и развития.Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus sagittis leo a nisl feugiat ultrices. Aenean congue eleifend ante nec porta. Nullam tincidunt eu odio sed pretium. Donec vel sem vel dolor sodales tempus. Maecenas scelerisque tincidunt felis, ac malesuada mauris sollicitudin at. Interdum et malesuada fames ac ante ipsum primis in faucibus. Vestibulum ac egestas ligula. Integer fringilla, magna ac posuere dignissim, mi orci rutrum justo, a feugiat dolor velit at nisl. Nunc consequat lacus sit amet lectus convallis maximus. Nam suscipit non velit in venenatis. Etiam maximus ipsum sit amet rhoncus eleifend. Fusce ut mi eget quam suscipit porttitor at ut nunc. Suspendisse nibh nibh, elementum vel nisl ac, volutpat sagittis sapien. Nulla eget vehicula arcu. Morbi egestas tristique venenatis."));
        this.databaseNews.add(new News(3, "22.11.2024 12:30", "Ольга Волкова",
                "Волонтеры организуют бесплатные курсы для школьников",
                "Волонтеры начали проводить бесплатные образовательные курсы для школьников, охватывая широкий спектр дисциплин, таких как математика, английский язык, информатика и даже основы робототехники. Курсы проходят в формате интерактивных занятий, где дети могут не только получать знания, но и учиться работать в команде, задавать вопросы и развивать критическое мышление. Особое внимание уделяется школьникам из неблагополучных семей, для которых такие занятия становятся важной поддержкой. Волонтеры также помогают школьникам подготовиться к экзаменам, что значительно увеличивает их шансы на успешное будущее.Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus sagittis leo a nisl feugiat ultrices. Aenean congue eleifend ante nec porta. Nullam tincidunt eu odio sed pretium. Donec vel sem vel dolor sodales tempus. Maecenas scelerisque tincidunt felis, ac malesuada mauris sollicitudin at. Interdum et malesuada fames ac ante ipsum primis in faucibus. Vestibulum ac egestas ligula. Integer fringilla, magna ac posuere dignissim, mi orci rutrum justo, a feugiat dolor velit at nisl. Nunc consequat lacus sit amet lectus convallis maximus. Nam suscipit non velit in venenatis. Etiam maximus ipsum sit amet rhoncus eleifend. Fusce ut mi eget quam suscipit porttitor at ut nunc. Suspendisse nibh nibh, elementum vel nisl ac, volutpat sagittis sapien. Nulla eget vehicula arcu. Morbi egestas tristique venenatis."));
        this.databaseNews.add(new News(4, "23.11.2024 10:00", "Иван Беляев",
                "Детский лагерь под управлением волонтеров открыл свои двери для 50 детей",
                "В одном из живописных уголков страны открылся детский лагерь, организованный волонтерами. Лагерь принимает 50 детей, предоставляя им уникальную возможность провести время в атмосфере заботы и внимания. Каждый день здесь наполнен различными мероприятиями, включая спортивные соревнования, творческие мастер-классы, занятия на свежем воздухе и образовательные лекции. Для детей это не только отдых, но и возможность обрести новые навыки, найти друзей и почувствовать себя частью большой семьи. Волонтеры обеспечивают круглосуточный уход, создавая безопасную и комфортную среду для всех участников.Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus sagittis leo a nisl feugiat ultrices. Aenean congue eleifend ante nec porta. Nullam tincidunt eu odio sed pretium. Donec vel sem vel dolor sodales tempus. Maecenas scelerisque tincidunt felis, ac malesuada mauris sollicitudin at. Interdum et malesuada fames ac ante ipsum primis in faucibus. Vestibulum ac egestas ligula. Integer fringilla, magna ac posuere dignissim, mi orci rutrum justo, a feugiat dolor velit at nisl. Nunc consequat lacus sit amet lectus convallis maximus. Nam suscipit non velit in venenatis. Etiam maximus ipsum sit amet rhoncus eleifend. Fusce ut mi eget quam suscipit porttitor at ut nunc. Suspendisse nibh nibh, elementum vel nisl ac, volutpat sagittis sapien. Nulla eget vehicula arcu. Morbi egestas tristique venenatis."));
        this.databaseNews.add(new News(5, "23.11.2024 15:00", "Екатерина Орлова",
                "Волонтеры организовали праздник для детей-сирот в детском доме",
                "Волонтеры провели незабываемый праздник для детей-сирот, проживающих в местном детском доме. Мероприятие началось с торжественного концерта, в котором приняли участие аниматоры, музыканты и даже маги-иллюзионисты. Затем для детей были организованы различные конкурсы и игры, где каждый мог проявить свои таланты. Волонтеры подарили детям множество подарков, среди которых были игрушки, книги и школьные принадлежности. Кульминацией дня стал праздничный ужин и фейерверк, оставивший яркие впечатления у всех участников. Многие дети выразили желание стать волонтерами в будущем.Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus sagittis leo a nisl feugiat ultrices. Aenean congue eleifend ante nec porta. Nullam tincidunt eu odio sed pretium. Donec vel sem vel dolor sodales tempus. Maecenas scelerisque tincidunt felis, ac malesuada mauris sollicitudin at. Interdum et malesuada fames ac ante ipsum primis in faucibus. Vestibulum ac egestas ligula. Integer fringilla, magna ac posuere dignissim, mi orci rutrum justo, a feugiat dolor velit at nisl. Nunc consequat lacus sit amet lectus convallis maximus. Nam suscipit non velit in venenatis. Etiam maximus ipsum sit amet rhoncus eleifend. Fusce ut mi eget quam suscipit porttitor at ut nunc. Suspendisse nibh nibh, elementum vel nisl ac, volutpat sagittis sapien. Nulla eget vehicula arcu. Morbi egestas tristique venenatis."));
        this.databaseNews.add(new News(6, "24.11.2024 18:00", "Марина Федорова",
                "Как стать волонтером и помогать детям с инвалидностью",
                "Для тех, кто хочет помогать детям с инвалидностью, организуются специальные тренинги и образовательные семинары. В рамках программы волонтеры узнают, как правильно взаимодействовать с детьми, учитывая их особенности. Особое внимание уделяется созданию комфортной обстановки, развитию самостоятельности и социального участия ребенка. Участники тренингов изучают основы жестового языка, использование вспомогательных технологий и техники эмоциональной поддержки. Такие программы привлекают как опытных специалистов, так и новичков, готовых посвятить время благородному делу."));
        this.databaseNews.add(new News(7, "25.11.2024 08:00", "Александр Петров",
                "Волонтерские программы для подростков помогают найти свое призвание",
                "Волонтерские программы, специально разработанные для подростков, становятся все популярнее. Молодежь участвует в разнообразных инициативах: от организации мероприятий до работы в детских домах и помощи пожилым людям. Эти программы помогают подросткам развивать лидерские качества, навыки коммуникации и решать сложные задачи. Многие из них позже выбирают профессию, связанную с социальной работой, медициной или образованием. Для некоторых волонтерство становится неотъемлемой частью жизни, позволяя реализовать свои мечты и приносить пользу обществу."));
        this.databaseNews.add(new News(8, "25.11.2024 14:00", "Наталья Иванова",
                "Детский дом запускает инициативу для привлечения волонтеров",
                "В одном из регионов стартовала новая инициатива детского дома, направленная на привлечение волонтеров. В рамках проекта планируется организация мероприятий по поддержке детей, включая творческие мастер-классы, занятия спортом и образовательные лекции. Волонтеры смогут стать наставниками для детей, помогая им раскрыть потенциал и обрести уверенность в себе. Детский дом активно сотрудничает с местными школами и университетами, приглашая студентов принять участие в этой важной работе."));
        this.databaseNews.add(new News(9, "26.11.2024 11:00", "Виктория Козлова",
                "Семинар для волонтеров: как помогать детям из неблагополучных семей",
                "Волонтеры собрались на специализированном семинаре, чтобы обсудить эффективные методы помощи детям из неблагополучных семей. Основные темы включали поддержку в учебе, психологическую помощь и организацию досуга. Лекторы делились реальными примерами успешных программ, подчеркивая важность создания доверительных отношений с детьми. Участники получили полезные советы и рекомендации, которые помогут им в дальнейшей работе."));
        this.databaseNews.add(new News(10, "27.11.2024 09:30", "Артем Григорьев",
                "Волонтеры провели акцию по сбору игрушек для детей в больницах",
                "Волонтеры организовали масштабную акцию по сбору игрушек для детей, находящихся в больницах. Акция прошла в десятках городов, и тысячи людей присоединились, чтобы подарить детям радость. Собранные игрушки передали в отделения детской онкологии, неврологии и хирургии. Мероприятие завершилось трогательной встречей с детьми, во время которой волонтеры лично вручали игрушки, рассказывали истории и поднимали настроение. Эта инициатива показала, как простые действия могут подарить детям тепло и заботу."));

        this.databaseUsers.add(new Users( 1,
                "john.doe@example.com", "Джон Доу", "123-456-7890", "Нью-Йорк",
                "TechCorp", "Программный инженер", "1990-01-01", "Не женат",
                "Ищу поддержку по вопросам психического здоровья", "Тихая и уединенная комната",
                "Отсутствуют", "Иногда", "Нет", "Нет", "Нет",
                "Нет", "Чтение, Пешие прогулки", "Да", "Нет"));

        this.databaseUsers.add(new Users( 2,
                "jane.smith@example.com", "Джейн Смит", "987-654-3210", "Лос-Анджелес",
                "HealthCare Inc.", "Медсестра", "1985-05-15", "Замужем",
                "Стресс на работе", "Светлое и открытое пространство",
                "Гипертония", "Нет", "Да", "Нет", "Нет",
                "Нет", "Садоводство, Йога", "Да", "Да"));

        this.databaseUsers.add(new Users( 3,
                "mark.jones@example.com", "Марк Джоунс", "555-666-7777", "Чикаго",
                "FinancePlus", "Бухгалтер", "1978-09-12", "Разведен",
                "Преодоление зависимости", "Реабилитационный центр",
                "Диабет", "Нет", "Нет", "Да", "Да",
                "Нет", "Рыбалка, Кино", "Нет", "Да"));

        this.databaseUsers.add(new Users( 4,
                "anna.brown@example.com", "Анна Браун", "444-333-2222", "Хьюстон",
                "CreativeWorks", "Графический дизайнер", "1992-11-20", "Не замужем",
                "Выгорание на работе", "Креативная и вдохновляющая обстановка",
                "Астма", "Нет", "Нет", "Нет", "Нет",
                "Нет", "Рисование, Путешествия", "Да", "Нет"));

        this.databaseUsers.add(new Users( 5,
                "paul.miller@example.com", "Пол Миллер", "111-222-3333", "Майами",
                "RetailPro", "Менеджер магазина", "1980-03-30", "Женат",
                "Семейные конфликты", "Группы поддержки, ориентированные на семью",
                "Отсутствуют", "Иногда", "Да", "Нет", "Нет",
                "Нет", "Спорт, Музыка", "Да", "Да"));

    }

    @Override
    public void connect() {

    }

    @Override
    public void disconnect() {

    }

    @Override
    public void insert(News news) {

    }

    @Override
    public void update(News news) {

    }

    @Override
    public void delete(int newsId) {

    }

    @Override
    public List<News> getAllNews() {
        return this.databaseNews;
    }

    @Override
    public List<News> getNewsById(int newsId) {
        return databaseNews.stream()
                .filter(news -> news.getId() == newsId)
                .collect(Collectors.toList());
    }

    @Override
    public List<News> getNewsByDay(LocalDate date) {
        List<News> newsOnDay = new ArrayList<>();
        for (News news : databaseNews) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                if (news.getDate().toLocalDate().equals(date)) {
                    newsOnDay.add(news);
                }
            }
        }
        return newsOnDay;
    }

    @Override
    public void addUser(Users users) {

    }

    @Override
    public void updateUser(Users users) {

    }

    @Override
    public void deleteUser(int userId) {

    }

    @Override
    public List<Users> getAllUsers() {
        return this.databaseUsers;
    }

    @Override
    public List<Users> getUserById(int userId) {
        return databaseUsers.stream()
                .filter(users -> users.getId() == userId)
                .collect(Collectors.toList());
    }
}
