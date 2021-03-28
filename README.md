# Jetpack-Compose
Learn Jetpack Compose for Native Android Development

Compose tutorials project


TUTORIAL 1
- Completed: Jetpack Compose Basics
Lesson 1: Composable functions
Jetpack Compose is built around composable functions. These functions let you define your app's UI programmatically by describing its shape and data dependencies, rather than focusing on the process of the UI's construction. 

To create a composable function, just add the @Composable annotation to the function name.

@Preview
@Composable
fun PreviewNewsStory()  {
    NewsStory()
}

Lesson 2: Layouts
UI elements are hierarchical, with elements contained in other elements. In Compose, you build a UI hierarchy by calling composable functions from other composable functions.

@Composable
fun Greeting(name: String) {
    Text("Hello $name!")
}

Lesson 3: Material design
Compose is built to support material design principles. Many of its UI elements implement material design out of the box. In this lesson, you'll style your app with material widgets.

modifier = Modifier
                .height(180.dp)
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(4.dp))


