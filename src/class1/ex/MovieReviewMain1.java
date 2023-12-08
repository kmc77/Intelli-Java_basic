package class1.ex;

public class MovieReviewMain1 {

    public static void main(String[] args) {
        MovieReview incepion = new MovieReview();
        incepion.title = "인셉션";
        incepion.review = "인생은 무한 루프";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 사건 영화";

        System.out.println("영화 제목: " + incepion.title + "영화 리뷰: " + incepion.review);
        System.out.println("영화 제목: " + aboutTime.title + "영화 리뷰: " + aboutTime.review);

    }
}
