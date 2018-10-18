public class QueueImp implements Stack {
    private int sizeQue;
    private int[] dataQue;
    private int outMark;

    public QueueImp(int size) {
        this.sizeQue = size;
        this.dataQue = new int[size];
        this.outMark = -1;
    }

    @Override
    public void push(int value) {
        try {
            if (this.outMark != -1) {
                for (int i = this.outMark; i >= 0; i--) {
                    int tmp = this.dataQue[i];
                    this.dataQue[i + 1] = this.dataQue[i];
                }
                this.dataQue[0] = value;
                this.outMark++;
            } else {
                this.dataQue[0] = value;
                this.outMark++;
            }
        }catch (IndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Max queue " + this.sizeQue, e);
        }

    }

    @Override
    public void pop() {
        if(this.outMark > -1) {
            this.outMark--;
        }
    }

    @Override
    public int peek() {
        try {
            return this.dataQue[this.outMark];
        }catch (IndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Queue is empty " + this.outMark, e);
        }
    }

    @Override
    public boolean isEmpty() {
        return this.outMark == -1;
    }

    @Override
    public boolean isFull() {
        return this.outMark == this.sizeQue-1;
    }

    public void insertPriority (int value) {
        int i;
        if (this.outMark == -1) {
            this.dataQue[0] = value;
            this.outMark++;
        }else {
            for (i = this.outMark; i >= 0; i--){
                if (value>this.dataQue[i]){
                    this.dataQue[i+1] = this.dataQue[i];
                }else break;
            }
            this.dataQue[i+1] = value;
            this.outMark++;
        }
    }


}