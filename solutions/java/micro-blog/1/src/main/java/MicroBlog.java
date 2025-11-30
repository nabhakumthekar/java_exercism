class MicroBlog {
    public String truncate(String input) {
                if(input == null) {
            return null;
        }
        String trimmedString = input.trim();

        int endIndex = trimmedString.offsetByCodePoints(0, Math.min(5,trimmedString.codePointCount(0, trimmedString.length())));

        return trimmedString.substring(0,endIndex);
    }
}
