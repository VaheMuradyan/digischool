import java.util.*;

public class Main {
    public static void main(String[] args) {

    }
}

abstract class allMoves{
    public List<Move> Moves = new LinkedList<>();

    public List<Move> getMoves() {
        return Moves;
    }
    abstract void setMoves(Move ... v);
}

class Move extends allMoves{
    private final String name;
    private final String janr;
    private double varkanish;
    public static class Builder{
        private final String name;
        private final String janr;
        private double varkanish = 0;
        Builder(String name, String janr){
            this.name = name;
            this.janr = janr;
        }

        public Builder varkanish(double val){
            this.varkanish = val < 0 || val > 10 ? 0 : val;
            return this;
        }

        public Move build(){
            return new Move(this);
        }

    }
    private Move(Builder builder){
        this.name = builder.name;
        this.janr = builder.janr;
        this.varkanish = builder.varkanish;
        Moves.add(this);
    }
    public void setVarkanish(double val){
        this.varkanish = val < 0 || val > 10 ? 0 : val;
    }

    public String getName() {
        return name;
    }

    public String getJanr() {
        return janr;
    }

    public double getVarkanish() {
        return varkanish;
    }



    public void setMoves(Move ... arr){
        for(int i = 0; i < arr.length; i++){
            Moves.add(arr[i]);
        }
    }

    public Optional<Move> getMove(Move move) throws NoSuchElementException{
        Move ob = null;
        for(int i = 0; i < Moves.size(); i++){
            if(Moves.get(i).getName().equals(move.getName())){
                ob = Moves.get(i);
                Moves.remove(i);
            }
        }
        return Optional.ofNullable(ob);
    }

    public Optional<Move> getMove(String name){
        Move ob = null;
        for(int i = 0; i < Moves.size(); i++){
            if(Moves.get(i).getName().equals(name)){
                ob = Moves.get(i);
                Moves.remove(i);
            }
        }
        return Optional.ofNullable(ob);
    }

    public void serchMove(Move move){
        for(Move val : Moves){
            if(val.getName().equals(move.getName())){
                System.out.println(val.getName() + " " + val.getJanr() + " " + val.getVarkanish());
            }
        }
    }

    public void serchMove(String name){
        for(Move val : Moves){
            if(val.getName().equals(name)){
                System.out.println(val.getName() + " " + val.getJanr() + " " + val.getVarkanish());
            }
        }
    }
}

class Customer{
    private LinkedList<Move> myMoves = new LinkedList<>();
    private final String name;
    private String contInfo;
    Customer(String name, String contInfo) {
        this.name = name;
        this.contInfo = contInfo;
    }
    Customer(String name){
        this(name,"Non");
    }

    public void rentalMove(Move ob){
        myMoves.add(ob);
    }

    public void showRentalMoves(){
        for(Move ob : myMoves){
            System.out.println(ob.getName() + " " + ob.getJanr() + " " + ob.getVarkanish());
        }
    }

    public Move getBackMove(){
        return myMoves.getLast();
    }

}

class Rental{
    private final Customer customer;
    private final Move move;
    public static final int rentalTime = 2000;

    Rental(Customer customer, Move move){
        this.customer = customer;
        this.move = move;
    }

    public void showMoves(){
        for(Move val : move.getMoves()){
            System.out.println(val.getName() + " " + val.getJanr() + " " + val.getVarkanish());
        }
    }

    public void serchMove(String name){
        move.serchMove(name);
    }

    public void serchMove(Move ob){
        move.serchMove(ob);
    }

    public void rentalMove(){
        try {
            customer.rentalMove(move);
            Thread.sleep(rentalTime);
            move.setMoves(customer.getBackMove());
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }

    public void rentalMove(Move ob){
        try {
            customer.rentalMove(ob);
            Thread.sleep(rentalTime);
            move.setMoves(customer.getBackMove());
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}


