public class Navigator {
    RouteStrategy routeStrategy;

    public Navigator(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    void buildRoute(double a, double b) {
        routeStrategy.buildRoute(a, b);
    }
}
