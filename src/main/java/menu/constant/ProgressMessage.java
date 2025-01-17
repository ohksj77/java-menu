package menu.constant;

public enum ProgressMessage {
    START_MESSAGE("점심 메뉴 추천을 시작합니다."),
    COACH_NAME_REQUEST("코치의 이름을 입력해 주세요. (, 로 구분)"),
    COACH_MENU_REQUEST("%s(이)가 못 먹는 메뉴를 입력해 주세요.");

    private final String message;

    ProgressMessage(final String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return this.message;
    }
}
