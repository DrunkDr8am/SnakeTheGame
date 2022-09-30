package SnakeTheGame;

public class Snake {
    private static boolean isExitRequested=false;

    ///Данные о нашей змее. Выползать она будет из нижнего левого угла,
    ///Вправо (направления посчитаны по часовой стрелки от севера, т.е.
    /// 0 -- вверх, 1 -- вправо, 2 -- вниз, 3 -- влево
    private static int x=Constants.CELLS_COUNT_X/2,y=Constants.CELLS_COUNT_X/2, direction=1, length=3;

    ///Флаг, который обращается в false, если на данном тике змея что-то съела
    private static boolean have_to_decrease = true;
   /** private static void move() {
        /// Если на прошлом тике мы что-то съели, то на этом должны вернуть значение на true
        have_to_decrease=true;

        ///Меняем координаты змеи в зависимости от направления
        switch(direction){
            case 0:
                y++; break;
            case 1:
                x++; break;
            case 2:
                y--; break;
            case 3:
                x--; break;
        }
        ///Проверяем, не вышла ли змея за границы
        if(x < 0 || x >= Constants.CELLS_COUNT_X || y < 0 || y >= Constants.CELLS_COUNT_Y){
            //TODO gameover
            System.exit(1);
        }

        ///Смотрим состояние ячейки, куда зашла змея
        int next_cell_state = GUI.getState(x,y);

        ///Если там змея, то это проигрыш
        if(next_cell_state>0){
            //TODO gameover
            System.exit(1);

        }else{
            ///Если там еда, то
            if(next_cell_state < 0){
                length++; ///Увеличиваем длину на единицу
                generate_new_obj(); ///Создаём новую еду
                have_to_decrease=false; ///Выставляем флаг того, что мы съели что-то
            }

            ///"Зажигаем" клетку
            GUI.setState(x,y,length);
        }
    }*/
}
