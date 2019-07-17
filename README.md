# Production-Practice
Production practice of gourp six, 2019

#### 项目起始时间2019.7.7 <br>
#### 组别：6 <br>
#### 组长：程航 <br>
#### 组员：朱思怡 包洁仪 黄蒋昊 林云 万琦钏 薛泽鑫 杨建文 <br>

#

## 第一次修改：程航 7.11 <br>
简    介：新增加了MainActivity、SettingActivity、ToDoListActivity及其相关布局的layout文件，以及一个用在MainActivity上的main_menu <br>
元素描述：MainActivity中共有4个按钮button1、button2、button3、button4，分别对应todolist、music、game、forum。一张图片imageView。设置memu一个，其中包含main_menu_item1、main_menu_item2、main_menu_item3，分别对应设置、关于我们、其他。 <br>
活动描述：MainActivity是主活动，与todolist相关的活动应该写在ToDoListActivity中，与设置有关的活动应该写在SettingActivity中，ToDoListActivity的下一级应该还有一个代办事项的活动，这里并没有创建。 <br>
逻辑分析：点击todolist按钮可进入ToDoListActivity，点击设置可进入SettingActivity。 <br>


## 第二次修改：杨建文 7.14<br>
新增加了七个fragment，分别对应一周的每一天，以及zhuyili、shijue、jiyili、bianbieli四个activity。每个fragment对应一个布局文件，每个activity对应一个布局文件。<br>
todolist中有七个按钮，点击可显示该日对应的fragment，每个fragment中有两个事件按钮，可跳转至相应事件。每个事件activity中有一个按钮（之后跳转至相应游戏）。<br>
打开todolist后，根据系统时间显示相应的fragment。<br>


## 第三次修改：黄蒋昊 7.15<br>
setting界面，添加了setting my_setting_name change_setting_name help feedback declare aboutus 按钮分别加上前置图标。<br>




