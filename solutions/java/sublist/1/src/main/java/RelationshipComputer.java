import java.util.List;

class RelationshipComputer<T> {
    Relationship computeRelationship(List<T> firstList, List<T> secondList) {
       if(firstList.equals(secondList)) {
           return Relationship.EQUAL;
       } else if(isSublist(firstList,secondList)) {
           return Relationship.SUBLIST;
       }  else if(isSublist(secondList, firstList)) {
           return Relationship.SUPERLIST;
       }
        return Relationship.UNEQUAL;
    }

    private boolean isSublist(List<T> smallList, List<T> bigList) {
        int smallSize = smallList.size();
        int bigSize = bigList.size();
        
        if (smallSize == 0) return true;
        if (smallSize > bigSize) return false;
                                // 5 - 3
        for (int i = 0; i <= bigSize - smallSize; i++) {
            boolean match = true;
            for (int j = 0; j < smallSize; j++) {
                if (!bigList.get(i + j).equals(smallList.get(j))) {
                    match = false;
                    break;
                }
            }
            if (match) return true;
        }
        return false;
    }
}
