package Package1.Ex.MovieReview1;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview[] reviews = new MovieReview[2]; //배열생성
        MovieReview inception = new MovieReview();
        inception.title = "인셉셥";
        inception.review = "인생은 무한 루프";
        reviews[0] = inception;

        MovieReview Abt = new MovieReview();
        Abt.title = "어바웃 타임";
        Abt.review = "인생 시간 영화!";
        reviews[1] = Abt;

        for (MovieReview review : reviews) {
            System.out.println("영화제목 " + review.title + "영화리뷰 " + review.review);
        }
    }
}
