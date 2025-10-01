import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    
    static Set<String> newCollection(List<String> cards) {
        Set<String> cardsSet = new HashSet<>();
        for( String card : cards){
            cardsSet.add(card);
        }
        return cardsSet;
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        Set<String> myCollectionCopy = new  HashSet<>(myCollection);
        Set<String> theirCollectionCopy = new  HashSet<>(theirCollection);
        
        myCollectionCopy.removeAll(theirCollection);
        theirCollectionCopy.removeAll(myCollection);
        
        return !myCollectionCopy.isEmpty() && !theirCollectionCopy.isEmpty();
    }

    static Set<String> commonCards(List<Set<String>> collections) {

        if(collections.size() == 1){
            Set<String> myCollection = new  HashSet<>(collections.get(0));
            return myCollection;
        }

            Set<String> myCollection = new  HashSet<>(collections.get(0));
            Set<String> theirCollection = new  HashSet<>(collections.get(1));
            Set<String> intersection = new  HashSet<>(myCollection);
            intersection.retainAll(theirCollection);
            return intersection;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> allCollection = new  HashSet<>();
        for(Set<String> collection : collections) {
            Set<String> myCollection = new  HashSet<>(collection);
            allCollection.addAll(myCollection);
        }

        return allCollection;
    }
}
