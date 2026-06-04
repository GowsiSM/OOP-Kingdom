# 🛠️ Getting Started in the Kingdom

> *Before you can build, you need to set up your workshop.*
> This guide takes you from zero to running the kingdom locally — step by step.

---

## What You'll Need

| Tool | Required Version | Why |
|------|-----------------|-----|
| **Git** | Any recent version | To fork and clone the repository |
| **Java (JDK)** | **17** (exactly) | The project is compiled against Java 17 |
| **Maven** | 3.8+ | The build tool that compiles and tests the code |

Don't have these installed? Follow the steps below.

---

## Step 1 — Fork the Repository

**Forking** creates your own personal copy of OOP Kingdom on GitHub, where you can freely make changes.

1. Go to [github.com/Hemanthkumar2k04/OOP-Kingdom](https://github.com/Hemanthkumar2k04/OOP-Kingdom)
2. Click the **Fork** button in the top-right corner
3. Select your GitHub account as the destination

✅ You now have `github.com/YOUR_USERNAME/OOP-Kingdom` — your personal copy.

---

## Step 2 — Clone Your Fork Locally

**Cloning** downloads your forked repository to your computer.

```bash
git clone https://github.com/YOUR_USERNAME/OOP-Kingdom.git
cd OOP-Kingdom
```

> Replace `YOUR_USERNAME` with your actual GitHub username.

---

## Step 3 — Install Java 17

The project requires **Java 17 specifically**. Using Java 11 or Java 21 may cause build failures.

**Download Java 17 (Temurin — free and open source):**

| Platform | Download Link |
|----------|--------------|
| Windows | [adoptium.net](https://adoptium.net/temurin/releases/?version=17) → `.msi` installer |
| macOS | [adoptium.net](https://adoptium.net/temurin/releases/?version=17) → `.pkg` installer |
| Linux | Use your package manager: `sudo apt install openjdk-17-jdk` |

**Verify your installation:**

```bash
java -version
```

Expected output:
```
openjdk version "17.x.x" ...
```

> ⚠️ If you see a different version, update your `JAVA_HOME` environment variable to point to JDK 17.

---

## Step 4 — Install Maven

**Maven** is the build tool that compiles the code and runs tests.

**Download Maven (3.8+):** [maven.apache.org/download.cgi](https://maven.apache.org/download.cgi)

**Or install via package manager:**

```bash
# macOS (Homebrew)
brew install maven

# Ubuntu/Debian
sudo apt install maven

# Windows — download the ZIP from the link above and add to PATH
```

**Verify your installation:**

```bash
mvn -version
```

Expected output:
```
Apache Maven 3.x.x ...
Java version: 17.x.x ...
```

> ⚠️ Make sure the Java version shown here is 17.

---

## Step 5 — Run Your First Build

Navigate into the `kingdom` subdirectory (this contains the `pom.xml` file):

```bash
cd kingdom
mvn clean test
```

You should see something like:

```
[INFO] Tests run: 12, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

🎉 **If you see `BUILD SUCCESS`, you're ready to start building the kingdom!**

---

## Step 6 — Create Your Branch

Before writing any code, create a new branch named after the class you're implementing:

```bash
git checkout -b feature/my-blacksmith
```

> Naming pattern: `feature/your-class-name` (e.g., `feature/barracks`, `feature/market`)

---

## 🔥 You're Ready!

Head over to [quests/week-01/quest.md](../quests/week-01/quest.md) to see what the kingdom needs next.

Study [Lumberyard.java](../kingdom/src/main/java/kingdom/entities/Lumberyard.java) — it's a complete, tested reference implementation that shows exactly what your submission should look like.

---

## 🛟 Troubleshooting

**`mvn` command not found**
→ Maven is not on your system PATH. Re-install Maven and ensure the `bin/` folder is added to PATH.

**`BUILD FAILURE` with Java version errors**
→ Your `JAVA_HOME` is pointing to the wrong Java version. Set it explicitly:
```bash
export JAVA_HOME=/path/to/jdk-17
```

**`BUILD FAILURE` with compilation errors in existing code**
→ Do not modify files in `core/` — those are maintainer-only. Reset with:
```bash
git checkout -- .
```

**Still stuck?**
→ Open a [GitHub Discussion](../../discussions) and describe what you see. Someone will help.
