package menu.constant;

public enum Category {
    JAPANESE_FOOD("일식"),
    KOREAN_FOOD("한식"),
    CHINESE_FOOD("중식"),
    ASIAN_FOOD("아시안"),
    WESTERN_FOOD("양식");

    private final String toKorean;

    Category(final String toKorean) {
        this.toKorean = toKorean;
    }

    @Override
    public String toString() {
        return this.toKorean;
    }
}