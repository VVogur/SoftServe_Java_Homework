package homework14.task2;

//Create your own annotation with 5 variables as metadata fields. Add usage of new annotation for method, class, variable.


    public @interface Info {

        public enum Class {
            LOW, MEDIUM, HIGH
        }

        String name() default "Cat";
        String color () default "Orange";
        String say () default  "Meow";
        int age () default 1;
        int weight () default 1;

    }
