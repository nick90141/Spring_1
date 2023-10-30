package Task_2;

public class Knight {
    private Quest quest;

    public Knight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        System.out.println("Начало");
        quest.embark();
        System.out.println("Конец");
    }
}

