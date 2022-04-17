package review;

import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;
import java.util.List;

@Component
public class ReviewRepository {
    public void create(Review review) {
        //inMemoryDataStore.getReviewMap().put(review.getId(), review);
    }

//    public Review getReviewById(Long id) {
    public void getReviewById(Long id) {
        //return inMemoryDataStore.getReviewMap().get(id);
    }
//    public List<Review> getAllReviews() {
    public void getAllReviews() {

    }

    public void updateReview(Review review) {
    }
    public void delete(Long id) {
    }

//    public List<Review> getAllReviewsByBookId(Long bookId) {
    public void getAllReviewsByBookId(Long bookId) {
//          return reviewList;
    }
}
