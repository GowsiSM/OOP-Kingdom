# ⚖️ PR Review Rubric

All Pull Requests in the OOP Kingdom are reviewed and scored by the community based on the following rubric. The implementation with the highest score wins the merge for that quest.

## Scoring System (Total: 60 points)

| Criteria | Points | Description |
| :--- | :---: | :--- |
| **Passes CI** | *Mandatory* | Code must compile and all tests must pass. If it breaks the kingdom, it is rejected. |
| **Follows quest requirements** | 10 | Does the entity fulfill all the functional requirements outlined in the weekly quest? |
| **OOP quality** | 20 | Proper use of Single Responsibility Principle (SRP), encapsulation, inheritance, and polymorphism. |
| **Extensibility** | 10 | Can future contributors easily build upon, extend, or interact with this class? Custom extra methods are highly encouraged and can earn full points here. |
| UML accuracy | 10 | Does the provided UML diagram accurately reflect the implemented Java code? **Optional** — 0 points if no diagram is submitted |
| **Naming & readability** | 10 | Clean code, descriptive variable/method names, and appropriate JavaDocs. |

## Review Process
- Reviewers should leave comments explaining their scores.
- Constructive feedback is expected and required.
- **Extra Methods Note**: Implementing extra methods beyond the quest contract is encouraged, but they **must** have corresponding unit tests. Submissions with untested extra methods will receive deductions under *Naming & readability* and/or *OOP quality* (or face rejection if they break CI).
- The highest score wins the merge!
