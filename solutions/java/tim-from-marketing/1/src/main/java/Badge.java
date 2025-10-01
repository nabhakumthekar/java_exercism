class Badge {
    public String print(Integer id, String name, String department) {
        StringBuilder sb = new StringBuilder();

        if(id == null) {
            if(department == null) {
                 sb.append(name + " - OWNER");
            } else {
                 sb.append(name + " - " + department.toUpperCase());
            } 
        }  else if(department == null) {
             sb.append("[" + id + "] - " + name + " - OWNER");
        }  else {
             sb.append("[" + id + "] - " + name + " - " + department.toUpperCase());
        }      
         return sb.toString();  
    }
}
