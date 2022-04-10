import React from 'react';
import Btn_primary from './components/Btn_primary';
import Btn_primary_disabled from './components/Btn_primary_disabled';
import Btn_secondary from './components/Btn_secondary';
import Btn_secondary_disabled from './components/Btn_secondary_disabled';
import Checkbox from './components/Checkbox';
import Link from './components/Link';
import Radiobutton from './components/Radiobutton';
import "./styles/kit_style.css"

function App() {
  return (
    <div className="App">
      <h1>UI kit</h1>
      <h2>Кнопки</h2>
      <div className='buttons'>
          Primary
          <Btn_primary value={"Кнопка"}/>
          <Btn_primary_disabled value={"Кнопка"}/>
        </div>
        <div className='buttons'>
          Secondary
          <Btn_secondary value={"Кнопка"}/>
          <Btn_secondary_disabled value={"Кнопка"}/>
        </div>
      <h2>Иконки</h2>
      <div className='icons'>
          
      </div>
      <h2>Ссылка</h2>
      <div className='link'>
        <Link value={"Ссылка"}/>
      </div>
      <h2>Чекбокс</h2>
      <div className='checkbox'>
        <Checkbox/>
        <Checkbox/>
        <Checkbox/>
      </div>
      <h2>Радиокнопка</h2>
      <div className='radiobutton'>
        <Radiobutton/>
      </div>
    </div>
  );
}

export default App;
