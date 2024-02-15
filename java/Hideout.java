public class Hideout<T> {
    private T foo;

    public void putIntoHideout(T toHide) {
        this.foo = toHide;
    }

    public T takeFromHideout() {
        T bar = this.foo;
        this.foo = null;
        return bar;
    }

    public boolean isInHideout() {
        return this.foo != null;
    }

    public static void main(String[] args) {
        Hideout<String> den = new Hideout<>();
        System.out.println(den.isInHideout());
        den.putIntoHideout("peekaboo");
        System.out.println(den.isInHideout());
        System.out.println(den.takeFromHideout());
        System.out.println(den.isInHideout());
        den.putIntoHideout("toodaloo");
        den.putIntoHideout("heelloo");
        System.out.println(den.isInHideout());
        System.out.println(den.takeFromHideout());
        System.out.println(den.isInHideout());
    }
}
