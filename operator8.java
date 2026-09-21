/*You're helping a pet shop create a system to determine if they can sell a pet to a customer.
Initialize the following variables:

hasLicense with the value true
hasSpace with the value false
hasExperience with the value true

Write the following logical expressions to determine if:
canSellRegularPet: Customer needs EITHER a license OR experience, AND must have space
canSellExoticPet: Customer needs BOTH a license AND experience, AND must have space
cannotSellAnyPet: Customer has NO license AND NO experience, OR has NO space
result: canSellRegularPet OR canSellExoticPet OR cannotSellAnyPet */

public class operator8 {
    public static void main(String[] args) {
        // Initialize variables
        boolean hasLicense=true;
        boolean hasSpace=false;
        boolean hasExperience=true;

        // Calculate conditions
        boolean canSellRegularPet = (hasLicense||hasExperience)&&hasSpace;
        boolean canSellExoticPet = (hasLicense&& hasExperience)&& hasSpace;
        boolean cannotSellAnyPet =(!hasLicense)&& (!hasExperience)||(!hasSpace);
        boolean result =cannotSellAnyPet||canSellExoticPet||canSellRegularPet;

        // Don't delete the lines below
        System.out.println("Can sell regular pet: " + canSellRegularPet);
        System.out.println("Can sell exotic pet: " + canSellExoticPet);
        System.out.println("Cannot sell any pet: " + cannotSellAnyPet);
        System.out.println("Result: " + result);
    }
}