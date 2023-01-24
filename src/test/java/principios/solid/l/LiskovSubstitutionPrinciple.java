package principios.solid.l;

public class LiskovSubstitutionPrinciple {

    class Rectangle {
        protected int width;
        protected int height;

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }
    }

    class Square extends Rectangle {
        public void setWidth(int width) {
            super.setWidth(width);
            super.setHeight(width);
        }

        public void setHeight(int height) {
            super.setWidth(height);
            super.setHeight(height);
        }
    }

}
