package Momento;

//So How Does It Work In Java?
//Let's use a simple example in Java to illustrate this pattern.
// As it's a pattern used for undo frameworks, we'll model a editor.
//First, the memento needs to be able to save editor contents, which will just be plain text:
//Memento
class EditorMemento {
    private final String editorState;
    public EditorMemento(String state) {
        editorState = state;
    }
    public String getSavedState() {
        return editorState;
    }
}

//Now our Originator class, the editor, can use the memento:
//Originator
class Editor {
    //state
    public String editorContents;
    public void setState(String contents) {
        this.editorContents = contents;
    }
    public EditorMemento save() {
        return new EditorMemento(editorContents);
    }
    //undo operation
    public void restoreToState(EditorMemento memento) {
        editorContents = memento.getSavedState();
    }
}
//Anytime we want to save the state, we call the save() method, and an undo would call the restoreToState() method.
//       Our caretaker can then keep track of all the memento's in a stack for the undo framework to work.
