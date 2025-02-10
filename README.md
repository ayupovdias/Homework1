# Homework1

# Documentation for the Hero Management System

This documentation provides an overview of the classes and interfaces used in the Hero Management System. The system allows you to create heroes with different roles (e.g., attackers and supporters), manage their health points (HP), and simulate battles and healing scenarios.

---

## Classes and Interfaces

### 1. `Attacker` Interface
The `Attacker` interface defines a method for attacking another hero.

#### Methods:
- **`String attacks(Hero hero)`**: This method is implemented by classes that can attack other heroes. It takes a `Hero` object as a parameter and returns a string describing the result of the attack.

---

### 2. `Hero` Abstract Class
The `Hero` class is an abstract class that serves as the base class for all hero types. It contains common properties and methods for heroes.

#### Properties:
- **`name`**: The name of the hero.
- **`heroClass`**: The class or type of the hero (e.g., Warrior, Archer).
- **`maxHP`**: The maximum health points (HP) the hero can have.
- **`currentHP`**: The current health points (HP) of the hero.
- **`alive`**: A boolean indicating whether the hero is alive or dead.

#### Methods:
- **`getName()`**: Returns the name of the hero.
- **`setName(String name)`**: Sets the name of the hero.
- **`getHeroClass()`**: Returns the class of the hero.
- **`setHeroClass(String heroClass)`**: Sets the class of the hero.
- **`getMaxHP()`**: Returns the maximum HP of the hero.
- **`setMaxHP(int maxHP)`**: Sets the maximum HP of the hero.
- **`isAlive()`**: Returns `true` if the hero is alive, otherwise `false`.
- **`setAlive(boolean alive)`**: Sets the alive status of the hero.
- **`getCurrentHP()`**: Returns the current HP of the hero.
- **`setCurrentHP(int currentHP)`**: Sets the current HP of the hero.
- **`toString()`**: An abstract method that must be implemented by subclasses to return a string representation of the hero.

---

### 3. `AttackerImpl` Class
The `AttackerImpl` class extends the `Hero` class and implements the `Attacker` interface. It represents a hero that can attack other heroes.

#### Properties:
- **`damage`**: The amount of damage the hero can inflict on others.

#### Methods:
- **`AttackerImpl()`**: Default constructor.
- **`AttackerImpl(String name, String heroClass, int maxHP, int damage)`**: Parameterized constructor to initialize the hero's properties.
- **`getDamage()`**: Returns the damage value.
- **`setDamage(int damage)`**: Sets the damage value.
- **`attacks(Hero target)`**: Implements the `attacks` method from the `Attacker` interface. It simulates an attack on another hero and returns a string describing the result.
- **`toString()`**: Returns a string representation of the `AttackerImpl` object.

---

### 4. `Support` Interface
The `Support` interface defines a method for healing another hero.

#### Methods:
- **`String heal(Hero hero)`**: This method is implemented by classes that can heal other heroes. It takes a `Hero` object as a parameter and returns a string describing the result of the healing.

---

### 5. `SupportImpl` Class
The `SupportImpl` class extends the `Hero` class and implements the `Support` interface. It represents a hero that can heal other heroes.

#### Properties:
- **`heal`**: The amount of HP the hero can restore to others.

#### Methods:
- **`SupportImpl()`**: Default constructor.
- **`SupportImpl(String name, String heroClass, int maxHP, int heal)`**: Parameterized constructor to initialize the hero's properties.
- **`getHeal()`**: Returns the heal value.
- **`setHeal(int heal)`**: Sets the heal value.
- **`heal(Hero target)`**: Implements the `heal` method from the `Support` interface. It simulates healing another hero and returns a string describing the result.
- **`toString()`**: Returns a string representation of the `SupportImpl` object.

---

### 6. `Team` Class
The `Team` class is used to manage a team of heroes. It allows adding heroes to the team and displaying all heroes in the team.

#### Properties:
- **`team`**: An array of `Hero` objects representing the team.
- **`index`**: An integer to keep track of the number of heroes in the team.

#### Methods:
- **`addInTeam(Hero hero)`**: Adds a hero to the team. If the team is full (maximum of 4 heroes), it prints a message indicating that no more heroes can be added.
- **`AllHeroesInTeam()`**: Displays all heroes currently in the team.
