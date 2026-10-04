# Assignment 3 — Bridge Pattern (House Builder theme)

| Role | Class |
| --- | --- |
| Abstraction | `House` (abstract, holds `BuildingMaterial`) |
| Refined Abstraction | `Cottage`, `Villa` |
| Implementor | `BuildingMaterial` (interface) |
| Concrete Implementor | `WoodMaterial`, `BrickMaterial`, `ConcreteMaterial` |
| Client | `Main` (swaps materials at runtime via `setMaterial`) |

Run: `javac -d out src/*.java && java -cp out Main`

## Clean Code principles
1. **Separation of responsibilities** – `House` decides *what* is built and in what order; the material decides *how* each step is done. The client never sees material details.
2. **Meaningful names** – `House` / `Cottage` / `Villa` (abstraction side) vs `BuildingMaterial` / `WoodMaterial` (implementation side).
3. **Small, focused classes** – each class has one reason to change (SRP).
4. **No duplicated logic** – cost calculation lives once in `House.estimateCost()`; materials only supply `pricePerSqm()`.
5. **Open/Closed** – a new material (e.g. `StoneMaterial`) or a new house type requires no changes to existing classes.
6. **Composition over inheritance** – avoids a class explosion (`WoodCottage`, `BrickVilla`, ...): 2 + 3 classes instead of 2 × 3.
