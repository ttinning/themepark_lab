import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> reviewed;

    public ThemePark() {
        this.reviewed = new ArrayList<>();
    }

    public void addReview(IReviewed review) {
        reviewed.add(review);
    }

    public ArrayList<IReviewed> getReviewed() {
        return reviewed;
    }

    public void visit(Visitor visitor, Attraction attraction) {
        attraction.addToVisitCount();
        visitor.visitAttraction(attraction);
    }



}
