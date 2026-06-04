# 🔨 Building and Testing the Kingdom

> *A kingdom that doesn't compile isn't a kingdom — it's rubble.*
> All commands below must be run from the `kingdom/` subdirectory (where `pom.xml` lives).

---

## Before You Begin

Make sure your environment is ready. If you haven't done this yet, follow [SETUP.md](SETUP.md) first.

**Quick check — run these in your terminal:**

```bash
java -version   # Should say: openjdk version "17.x.x"
mvn -version    # Should say: Apache Maven 3.x.x, Java version: 17
```

If either of these fails or shows the wrong version, go back to [SETUP.md](SETUP.md).

---

## The Commands

### 1. Compile the Code

Cleans old build files and recompiles everything from scratch:

```bash
cd kingdom
mvn clean compile
```

**Expected output:**
```
[INFO] BUILD SUCCESS
```

---

### 2. Run All Tests

Compiles the code and runs every unit and integration test in the project:

```bash
cd kingdom
mvn clean test
```

**Expected output:**
```
[INFO] Tests run: XX, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

> ✅ Before raising a PR, **always run this command** and make sure you see `BUILD SUCCESS` with `Failures: 0`.

---

### 3. Boot the Application

Runs the `Main.java` entry point as a sanity check — verifies that the kingdom loads correctly:

```bash
cd kingdom
mvn exec:java -Dexec.mainClass="kingdom.Main"
```

You should see the kingdom state printed to the console without any errors.

---

## Running Your Own Tests Only

While developing, you might only want to run your own test class (faster feedback):

```bash
cd kingdom
mvn test -Dtest=BlacksmithTest
```

> Replace `BlacksmithTest` with the name of your test class.

---

## 🛟 Troubleshooting

**`BUILD FAILURE` — "Source option 5 is no longer supported"**
→ You're using the wrong Java version. The project requires **Java 17**. Check with `java -version` and update `JAVA_HOME`.

**`BUILD FAILURE` — "Could not find artifact"**
→ Maven can't download a dependency. Check your internet connection and try again.

**`BUILD FAILURE` — "package kingdom.entities does not exist"**
→ You might be running `mvn` from the wrong directory. Make sure you're inside the `kingdom/` folder, not the repository root.

**Tests pass locally but fail on CI**
→ CI runs on Java 17 strictly. Ensure you haven't used any APIs or syntax from newer Java versions.

**Still stuck?**
→ Open a [GitHub Discussion](../../discussions) and paste your full error output.
