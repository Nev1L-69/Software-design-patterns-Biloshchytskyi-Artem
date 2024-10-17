Assignment 1: Adapter Pattern - Audio Player
Adapter Pattern
Шаблон Adapter используется для обеспечения совместимости интерфейсов, предоставляя
способ воспроизведения AudioPlayer файлов WAV и AAC без изменения его структуры.
Этот паттерн позволяет MusicPlayer работать с различными аудиоформатами, переделывая интерфейс
AdvancedAudioPlayer подходящий для AudioPlayer.


Assignment 2: Bridge Pattern - Remote Control System
Bridge Pattern
Паттерн Bridge отделяет абстракцию от ее реализации, позволяя им меняться независимо друг от друга.
Здесь абстракцией является RemoteControl, а реализацией - конкретное управляемое устройство ( TV, DVD, Sound System).

Интерфейс Device определяет основные операции: powerOn(), powerOff(), setChannel(int channel), setVolume(int volume).


Assignment 3: Composite Pattern - Menu System
Composite Pattern
Шаблон Composite позволяет объединять объекты в структуру дерева для одинакового отношения.
Он позволяет одинаково относиться к отдельным объектам и композициям объектов.

MenuComponent - это абстрактный класс с такими методами, как getName(), getDescription(), getPrice(), print().
MenuItem - конкретный класс, представляющий отдельные пункты меню.


Assignment 4: Decorator Pattern - Pizza Ordering System
Decorator Pattern
Паттерн Decorator динамически добавляет поведение к объектам, не изменяя их структуру.
 Он используется для расширения функциональности объекта.

Интерфейс Pizza определяет методы getDescription() и getCost().
Конкретные классы, такие как MargheritaPizza и VegetarianPizza, имплеиентируют Pizza.


Assignment 5: Facade Pattern - Smart Home System
Facade Pattern
Паттерн Facade обеспечивает упрощенный интерфейс к большому объему кода.
 Он предлагает интерфейс более высокого уровня, который делает подсистему более простой в использовании.

Для каждого умного устройства (LIghts, Thermostat, SecuritySystem, EntertainmentSystem)
создаются отдельные классы с определенными операциями.


Assignment 6: Flyweight Pattern - Character Rendering in a Text Editor
Flyweight Pattern
Паттерн Flyweight минимизирует использование памяти, разделяя общие части состояния между несколькими объектами.
 В данном случае он используется для эффективного отображения большого количества символов.

Класс Character имеет внутреннее состояние (char Value, Font, Size) и внешнее состояние (position).
CharacterFactory управляет экземплярами flyweight, создавая новые символы только в том случае, если их еще нету.


Assignment 7: Proxy Pattern - Online Learning Platform
Proxy Pattern
Паттерн Proxy предоставляет суррогат или место для другого объекта, чтобы контролировать доступ к нему.
Он используется для реализации ленивой загрузки VideoLectures, загружая их только тогда, когда это необходимо.

Интерфейс VideoLecture определяет методы getInfo() и play().