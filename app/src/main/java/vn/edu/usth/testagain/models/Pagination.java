package vn.edu.usth.testagain.models;

public class Pagination {
    private long limit;
    private long offset;
    private long count;
    private long total;

    public long getLimit() { return limit; }
    public void setLimit(long value) { this.limit = value; }

    public long getOffset() { return offset; }
    public void setOffset(long value) { this.offset = value; }

    public long getCount() { return count; }
    public void setCount(long value) { this.count = value; }

    public long getTotal() { return total; }
    public void setTotal(long value) { this.total = value; }
}
