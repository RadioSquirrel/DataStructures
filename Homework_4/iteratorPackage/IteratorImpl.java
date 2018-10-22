package iteratorPackage;

public class IteratorImpl implements Iterator {
    private Unit linkСurrent;
    //private Unit linkPrev;
    private ListUnit list;

    IteratorImpl (ListUnit list) {
        this.list = list;
        this.reset();
    }

    @Override
    public void reset() {
        this.linkСurrent = list.getFirst();
        //this.linkPrev = null;
    }

    @Override
    public void nextLink() {
        if (this.linkСurrent.getNext() != null) {
            //this.linkPrev = this.linkСurrent;
            this.linkСurrent = this.linkСurrent.getNext();
        }
    }

    @Override
    public void prevLink() {
        if (this.linkСurrent.getPrev() != null) {
            this.linkСurrent = this.linkСurrent.getPrev();
            //this.linkPrev = this.linkPrev.getPrev();
        }
    }

    @Override
    public Unit getCurrent() {
        return this.linkСurrent;
    }

    @Override
    public boolean atEnd() {
        return this.linkСurrent.getNext() == null;
    }

    @Override
    public void insertAfter(String name, String surname) {
            Unit newUnit = new Unit(name, surname, null, null);
            if (this.list.isEmpty()) {
                this.list.setFirst(newUnit);
                this.linkСurrent = newUnit;
            } else {
                newUnit.setLink(this.linkСurrent.getNext(), this.linkСurrent);
                this.linkСurrent.setLink(newUnit,this.linkСurrent.getPrev());
                this.nextLink();
            }
    }

    @Override
    public void insertBefore(String name, String surname) {
        Unit newUnit = new Unit(name, surname, null, null);
        if (this.list.isEmpty()) {
            this.list.setFirst(newUnit);
            this.linkСurrent = newUnit;
        } else {
            if (this.linkСurrent.getPrev() == null) {
                newUnit.setLink(this.list.getFirst(), null);
                this.list.setFirst(newUnit);
                this.reset();
            } else {
                newUnit.setLink(this.linkСurrent.getPrev().getNext(), this.linkСurrent.getPrev());
                this.linkСurrent.getPrev().setLink(newUnit, this.linkСurrent.getPrev().getPrev());
                this.linkСurrent.setLink(this.linkСurrent.getNext(),newUnit);
                this.linkСurrent = newUnit;
            }
        }
    }

    @Override
    public String deleteCurrent() {
        String strUnit = this.linkСurrent.toString();
        if (this.linkСurrent.getPrev() == null) {
            this.list.setFirst(this.linkСurrent.getNext());
            this.reset();
        }else {
            this.linkСurrent.getPrev().setLink(this.linkСurrent.getNext(), this.linkСurrent.getPrev().getPrev());
            this.linkСurrent.getNext().setLink(this.linkСurrent.getNext().getNext(),this.linkСurrent.getPrev());
            if (this.atEnd()){
                this.reset();
            }else {
                this.linkСurrent = this.linkСurrent.getNext();
            }
        }
        return strUnit;
    }
}
