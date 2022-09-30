package SnakeTheGame;


public class Constants {
///Размер игровой ячейки
public static final int CELL_SIZE = 32;

///Размеры игрового поля в ячейках
public static final int CELLS_COUNT_X = 20;
public static final int CELLS_COUNT_Y = 20;

///Шанс появления ягод на старте в процентах.
///При выставленном значении спавнится 3-5 ягод.
///Не беспокойтесь, что значение слишком низкое, как минимум одна ягода создаётся отдельно.
public static final int INITIAL_SPAWN_CHANCE = 1;//%

///В нашем случае змея проходит одну клетку за один фрейм.
///Значение 5 мне показалось оптимальным, но вы можете экспериментировать.
public static final int FPS = 5;

///Константы для создания окна, названия достаточно говорящие.
public static final int SCREEN_WIDTH =CELLS_COUNT_X*CELL_SIZE;
public static final int SCREEN_HEIGHT = CELLS_COUNT_Y*CELL_SIZE;
public static final String SCREEN_NAME = "Tproger's Snake";
        }