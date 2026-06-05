# 📜 Quest Submission Guide

Use this checklist when submitting your Pull Request. A focused PR makes community review smoother and increases your chances of being merged.

---

## ✅ Pre-Submission Checklist

### Code Quality
- [ ] Your class extends the appropriate abstract contract (e.g., `AbstractLumberyard`)
- [ ] All abstract methods are implemented
- [ ] All fields have `@JsonProperty` annotations
- [ ] No-arg constructor initializes safe defaults (UUID identity, `LocalDate.now()`, `UNDER_CONSTRUCTION` status)
- [ ] Static registration block included: `static { KingdomRegistry.register(YourClass.class); }`
- [ ] Extra methods (if any) have corresponding unit tests

### Naming
- [ ] Class file: `PascalCase` matching contract (e.g., `Market.java`)
- [ ] Test file: `PascalCase` + `Test` (e.g., `MarketTest.java`)
- [ ] Methods and fields: `camelCase`
- [ ] Constants: `UPPER_SNAKE_CASE`

### Testing
- [ ] Constructor defaults verified (UUID identity, safe defaults)
- [ ] Contract methods tested
- [ ] Extra methods tested (if any)
- [ ] Jackson serialization/deserialization tested
- [ ] `cd kingdom && mvn clean test` — all tests pass

### Boot Test
- [ ] `cd kingdom && mvn exec:java -Dexec.mainClass="kingdom.Main"` — boots successfully

### Documentation
- [ ] Mermaid UML diagram included in PR description (optional, +10 pts)
- [ ] Design decisions explained

### contributors.json
- [ ] New class: `"ClassName": "YourGitHubUsername"`
- [ ] Extending existing class: `"ClassName": "OriginalAuthor, YourGitHubUsername"` (append, don't overwrite)

### PR Scope — Only 3 Files Changed
- [ ] 1. Your entity class (e.g., `Lumberyard.java`)
- [ ] 2. Your test class (e.g., `LumberyardTest.java`)
- [ ] 3. `contributors.json`

---

> **⚠️ Any other file modifications (except docs changes approved by maintainers) will result in automatic PR rejection.**

---

## 📎 Resources

- [Build & Test Guide](../docs/BUILD.md) — full Maven command reference
- [Code Standards](../docs/CODE_STANDARDS.md) — OOP principles, naming, testing
- [PR Template](../.github/PULL_REQUEST_TEMPLATE.md) — use this when opening your PR
- [Review Rubric](../docs/REVIEW_RUBRIC.md) — how your PR will be scored
- [Contributing Guide](../.github/CONTRIBUTING.md) — full contribution rules