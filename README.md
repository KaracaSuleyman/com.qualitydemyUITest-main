

# RULES

## WRITING RULES

* There **must be comment lines inside the code**.

## NAMING CONVENTIONS

1. Names **must end with the type**

   * Example: `courseManagerButton`
2. **camelCase** must be used.
3. Names **must always end with the component type**

   * Examples: `button`, `text`, `dropdown`, etc.

---

## GITHUB

### REQUIRED GITHUB PRACTICES

* After being added as a GitHub collaborator, the **first step is to create a branch**.
* `git add .` must be executed **only in your own branch**.
* `git commit -m "..."` must be executed **only in your own branch** and then pushed so the branch is registered in the repository.
* ❌ **Do NOT use** commands like:

  ```
  "git add ."
  ```
* ✅ **Always use file paths** with `git add`.

  * You can get the correct path by:

    * Right-clicking the class
    * Selecting **Copy Path**
    * Choosing **Path from Content Root**
  * Example:

    ```
    src/test/java/tests/QA_Suleyman/US_10.java
    ```
* Before starting any work on the project, run:

  ```
  git pull
  ```

  **on the `main` branch**.
* `git pull` **must always be done on `main`**, then switch to your own branch and merge.
* **Always make sure you are NOT on `main`** while working.
* Commit message format must be:

  ```
  -m "date name"
  ```

---

### FORBIDDEN GITHUB PRACTICES

* ❌ **Never work on `main`**.
* ❌ **Never push without communication**.
* ❌ If a change affects shared/common areas, **contact the team lead first**.

---
