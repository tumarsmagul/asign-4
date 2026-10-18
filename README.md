# SMM Post Scheduler

A simple example of the Facade pattern in Java. The program prepares a social media post: it checks the text, adds hashtags, prepares an image, and checks the publishing time.

The `Main` class uses only `SmmFacade`. The facade calls the subsystem classes: `TextEditor`, `HashtagService`, `ImageService`, `TimeService`, and `PostService`.

Each subsystem class has one small task and does not know about the facade.

## Run

Java 17 or newer is required. Run these commands from the project root:

```sh
mkdir -p out
javac -d out $(find src/main/java -name '*.java')
java -cp out smm.Main
```

## Clean Code principles

- Classes and methods have clear names.
- Each class has one responsibility.
- `Main` does not call subsystem classes directly.
- Empty text and a missing time produce clear errors.
- The facade hides the order in which subsystem classes are called.
