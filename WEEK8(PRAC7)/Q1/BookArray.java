public class BookArray{
    public static void main(String[] args){
        //array that stores 10 books
        Book books[] = new Book[10];

        //store 5 fiction books/objects
        books[0] = new Fiction("Thats what Alex wrote");
        books[1] = new Fiction("Randy's great adventures");
        books[2] = new Fiction("Dmitry's Russian roulette");
        books[3] = new Fiction("Coding is addictive");
        books[4] = new Fiction("That's my final Fiction dream");

        //store 5 non-fiction book/objects
        books[5] = new NonFiction("Ready set go");
        books[6] = new NonFiction("Cats can talk");
        books[7] = new NonFiction("Dogs can drive cars");
        books[8] = new NonFiction("Politics is awesome");
        books[9] = new NonFiction("Australia the richest country");

        //using a loop, display the details of all the books in the array
        for(int i = 0; i < books.length; i++) {
            System.out.println("--------------------------");
            System.out.println((i + 1) + ". Title: " + books[i].getTitle());
            System.out.println("Price: $" + books[i].getPrice());

        }
    }
}
