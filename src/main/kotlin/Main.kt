/*
   (1) элемент Tree(x), где x: T - бинарное дерево,
   (2) пустой элемент null - бинарное дерево
   (3) A и B - бинарные деревья, а x - элемент типа T,
       тогда (x, A, B) - бинарное дерево,
       A - левым потомок
       B - правый потомок

       x
    A     B

    Бинарное дерево поиска - это бинарное дерево со сравнимыми элементами
    с доп. условием:
    все элементы в левом поддереве меньше корня
    все элементы в правом поддереве больше или равны корня.
*/
fun main() {
    val tree = BinarySearchTree<Int>()
    val list = listOf(5, 3, 2, 3, 1, 7, 6)
    for (x in list) {
        tree.insert(x)
    }
    println(tree)
    tree.remove(5)
    println(tree)
    println(tree.find(1))
    println(tree.find(5))
    println(tree.find(1))
    println(tree.nextNode(1))
}