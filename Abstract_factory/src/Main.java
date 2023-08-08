import java.util.Random;

// Asteroids
interface Asteroid {
    void show();
}

class IceAsteroid implements Asteroid {
    public void show() {
        System.out.println("Ice Asteroid popped up");
    }
}

class IronAsteroid implements Asteroid {
    public void show() {
        System.out.println("Iron Asteroid popped up");
    }
}

class RockyAsteroid implements Asteroid {
    public void show() {
        System.out.println("Rocky Asteroid popped up");
    }
}

class DiamondAsteroid implements Asteroid {
    public void show() {
        System.out.println("Diamond Asteroid popped up");
    }
}

// Debris Fields
interface DebrisField {
    void show();
}

class DynamicDebrisField implements DebrisField {
    public void show() {
        System.out.println("Dynamic Debris Field appeared");
    }
}

class PersistentDebrisField implements DebrisField {
    public void show() {
        System.out.println("Persistent Debris Field appeared");
    }
}

class StaticDebrisField implements DebrisField {
    public void show() {
        System.out.println("Static Debris Field appeared");
    }
}

// Abstract Factory: ObstacleFactory
interface ObstacleFactory {
    Asteroid createAsteroid();
    DebrisField createDebrisField();
}

// Concrete Factories
class Level1Factory implements ObstacleFactory {
    public Asteroid createAsteroid() {
        return new IceAsteroid();
    }

    public DebrisField createDebrisField() {
        return new StaticDebrisField();
    }
}

class Level2Factory implements ObstacleFactory {
    public Asteroid createAsteroid() {
        return new RockyAsteroid();
    }

    public DebrisField createDebrisField() {
        return new DynamicDebrisField();
    }
}

class Level3Factory implements ObstacleFactory {
    public Asteroid createAsteroid() {
        return new DiamondAsteroid();
    }

    public DebrisField createDebrisField() {
        return new PersistentDebrisField();
    }
}

class Level4Factory implements ObstacleFactory {
    public Asteroid createAsteroid() {
        return new IronAsteroid();
    }

    public DebrisField createDebrisField() {
        return new DynamicDebrisField();
    }
}

class Level5Factory implements ObstacleFactory {
    public Asteroid createAsteroid() {
        return new IronAsteroid();
    }

    public DebrisField createDebrisField() {
        return new StaticDebrisField();
    }
}

// Client
public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int level = random.nextInt(5) + 1; // Randomly select a level from 1 to 5
        int score = random.nextInt(2001);

        ObstacleFactory factory = null;

        switch (level) {
            case 1:
                factory = new Level1Factory();
                break;
            case 2:
                factory = new Level2Factory();
                break;
            case 3:
                factory = new Level3Factory();
                break;
            case 4:
                factory = new Level4Factory();
                break;
            case 5:
                factory = new Level5Factory();
                break;
            default:
                System.out.println("Invalid level: " + level);
                return;
        }

        Asteroid asteroid = factory.createAsteroid();
        DebrisField debrisField = factory.createDebrisField();

        asteroid.show();
        debrisField.show();
    }
}
