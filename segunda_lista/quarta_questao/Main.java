class Main {
    public static void main(String[] args) { 
        RoadStrategy roadStrategy = new RoadStrategy();
        Navigator navigator = new Navigator(roadStrategy);
        navigator.buildRoute(0, 0);
    }
}