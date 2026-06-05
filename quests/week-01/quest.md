# ⚔️ Week 01 Quest: The Foundation

The kingdom requires its foundational structures to support the growing population.

## Available Entities

| Entity | Contract | Status |
|--------|----------|--------|
| **Lumberyard** | `AbstractLumberyard` | ✅ Example implementation — see [`Lumberyard.java`](../kingdom/src/main/java/kingdom/entities/Lumberyard.java) |
| **Barracks** | [`AbstractBarracks`](../kingdom/src/main/java/kingdom/contracts/AbstractBarracks.java) | Not yet built — ready for contributors! |
| **Blacksmith** | [`AbstractBlacksmith`](../kingdom/src/main/java/kingdom/contracts/AbstractBlacksmith.java) | Not yet built — ready for contributors! |
| **Market** | [`AbstractMarket`](../kingdom/src/main/java/kingdom/contracts/AbstractMarket.java) | Not yet built — ready for contributors! |

---

## Instructions

1. **Pick an entity** — Barracks, Blacksmith, or Market (Lumberyard is done as a reference)
2. **Read the contract** — open the corresponding abstract class in `kingdom/contracts/`
3. **Implement the class** in `kingdom/entities/` — extend the contract, implement all methods, add `@JsonProperty`, register with `KingdomRegistry`
4. **Write tests** in `kingdom/src/test/java/kingdom/entities/` — constructor, contract methods, extra methods, Jackson serialization
5. **Test locally:**
   ```bash
   cd kingdom
   mvn clean test
   ```
6. **Boot check:**
   ```bash
   cd kingdom
   mvn exec:java -Dexec.mainClass="kingdom.Main"
   ```
7. **Update [`contributors.json`](../contributors.json):** `"YourClass": "YourGitHubUsername"`
8. **Create a UML diagram** (optional — earns bonus points during review)
9. **Submit a PR** using the [PR Template](../.github/PULL_REQUEST_TEMPLATE.md)

---

## 📚 Reference

| Doc | Link |
|-----|------|
| Code Standards | [CODE_STANDARDS.md](../docs/CODE_STANDARDS.md) |
| Build & Test | [BUILD.md](../docs/BUILD.md) |
| Review Rubric | [REVIEW_RUBRIC.md](../docs/REVIEW_RUBRIC.md) |
| Quest Guide | [template.md](../quests/template.md) |
| Contributing Guide | [CONTRIBUTING.md](../.github/CONTRIBUTING.md) |

---

_May the best design win. ⚔️_