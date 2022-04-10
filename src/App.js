import React from 'react';
import Icon_bag from './components/Icon_bag';
import Icon_cart from './components/Icon_bag';
import Icon_delete from './components/Icon_delete';
import Link from './components/Link';
import './styles/kit_style.css'
import './styles/btn_primary.css'
import './styles/btn_secondary.css'
import './styles/checkbox.css'
import './styles/radiobutton.css'

function App() {
  return (
    <div className="App">
      <h1>UI kit</h1>

      <h2>Кнопки</h2>
      <div className='buttons'>
          Primary
          <button class="btn-primary" href='#'>Кнопка</button>
          <button class="btn-primary" href='#' disabled>Кнопка</button>
        </div>
        <div className='buttons'>
          Secondary
          <button class = "btn-secondary">Кнопка</button>
          <button class = "btn-secondary" disabled>Кнопка</button>
        </div>

      <h2>Иконки</h2>
      <div className='icons'>
          <p>Иконка 1</p>
          <Icon_bag/>
          <p>Иконка 2</p>
          <Icon_delete/>
      </div>

      <h2>Ссылка</h2>
      <Link value={"Ссылка"}/>

      <h2>Чекбокс</h2>
      <div className='checkbox'>
      <input class="custom-checkbox" type="checkbox" id="color-1" name="color-1" value="indigo"/><label for="color-1">Текст</label>
      <input class="custom-checkbox" type="checkbox" id="color-2" name="color-1" value="indigo"/><label for="color-2">Текст</label>
      <input class="custom-checkbox" type="checkbox" id="color-3" name="color-1" value="indigo" disabled/><label for="color-3">Текст</label>
      <input class="custom-checkbox" type="checkbox" id="color-4" name="color-1" value="indigo"/><label for="color-4">Текст</label>
      </div>

      <h2>Радиокнопка</h2>
      <div className='radiobutton'>
      <input class="custom-radio" type="radio" id="color-5" name="color" value="indigo1" /><label for="color-5">Положение 1</label>
      <input class="custom-radio" type="radio" id="color-6" name="color" value="indigo1" /><label for="color-6">Положение 2</label>
      <input class="custom-radio" type="radio" id="color-7" name="color" value="indigo1" /><label for="color-7">Положение 3</label>
      </div>
    </div>
  );
}

export default App;
