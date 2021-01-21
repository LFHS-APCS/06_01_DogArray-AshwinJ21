public class DogArray
{

    /**
     *  Returns the index of the youngest dog in the given array
     */
    public static int getYoungestIndex(Dog[] dogs)
    {   
        int indexOfYoungestDog = 0;
        for(int i = 0; i<dogs.length; i++){
          if(dogs[i].getAge()<dogs[indexOfYoungestDog].getAge()){
            indexOfYoungestDog=i;
          }
        }
        return indexOfYoungestDog;
    }

    /**
     *  Returns the name of the youngest dog in the given array
     */
    public static String getYoungestName(Dog[] dogs)
    {
        int indexOfNameOfYoungestDog = 0;
        String nameOfYoungestDog = dogs[indexOfNameOfYoungestDog].getName();
        for(int i = 0; i<dogs.length; i++){
          if(dogs[i].getAge()<dogs[indexOfNameOfYoungestDog].getAge()){
            nameOfYoungestDog=dogs[i].getName();
            indexOfNameOfYoungestDog = i;
          }
        }
        return nameOfYoungestDog;
    }
}
