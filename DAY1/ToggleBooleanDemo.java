 class ToggleBoolean {
    static boolean toggle(boolean value) {
        return !value;
    }
    static boolean toogleUsingXor(Boolean value){
        return value ^ true;
    }
    static boolean toggleUsingTernary(Boolean value){
        return value ? false : true;
    }
    static boolean toogleUsingIfElse(Boolean value){
        if(value) {
            return false;
        } else {
            return true;
        }
    }
    static boolean toggleUsingSwitch(Boolean value){
        switch(value ? 1:0) {
            case 1:
                return false;
            case 0:
                return true;
            default:
                return value;
        }
        // return value; 
    }
}
class ToggleBooleanDemo {
    public static void main(String[] args) {
        boolean value = true;
        System.out.println("Original Value: " + value);
        System.out.println("Toggle using NOT ! operator: " + ToggleBoolean.toggle(value));
        System.out.println("Toggle using XOR: " + ToggleBoolean.toogleUsingXor(value));
        System.out.println("Toggle using Ternary Operator: " + ToggleBoolean.toggleUsingTernary(value));
        System.out.println("Toggle using If-Else: " + ToggleBoolean.toogleUsingIfElse(value));
        System.out.println("Toggle using Switch: " + ToggleBoolean.toggleUsingSwitch(value));
    }
}