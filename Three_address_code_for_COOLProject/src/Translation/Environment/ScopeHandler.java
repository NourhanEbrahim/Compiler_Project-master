package Translation.Environment;

import Translation.Token;

import java.util.Vector;

@SuppressWarnings("unused")
public class ScopeHandler {


    // private constructor to forbid object creation
    private ScopeHandler() {

    }

    private static Vector<Scope> scopes =new Vector<>();


    public static void pushScope() {

        Scope newScope = new Scope();
        scopes.add(scopes.size(), newScope);
    }

    public static void popScope() {
        scopes.remove(scopes.size()-1);

    }

    public static Token getToken(String name) {
        int currentScopeIndex = scopes.size()-1;

        while (currentScopeIndex >= 0) {
            Scope currentScope = scopes.get(currentScopeIndex);
            if (currentScope.hashtable.containsKey(name)) return currentScope.getToken(name,currentScopeIndex+1);
            currentScopeIndex--;
        }

        throw new RuntimeException("Translation.Token " + name + " not found !");
    }

    public static void addToken(Token token) {
        scopes.get(scopes.size()-1).addToken(token);
    }


    public static void clear() {
        scopes.clear();
        Scope.reset();
    }
}