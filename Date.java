enum Month{
    JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NAV,DEC;
}
    class Date {
    int year;
    Month month;
    int date;
    Date(int a, Month b ,int c){
        year = a;
        month = b;
        date = c;
    }
    public String getDate(){
        return "date : "+date+" - "+month+" - "+ year;
    }
        public String getBirth(){
            return "date of birth: "+date+" - "+month+" - "+ year;
        }
}
